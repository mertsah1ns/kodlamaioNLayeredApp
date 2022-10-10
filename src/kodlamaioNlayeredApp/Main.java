package kodlamaioNlayeredApp;

import kodlamaioNlayeredApp.business.CategoryManager;
import kodlamaioNlayeredApp.business.CourseManager;
import kodlamaioNlayeredApp.business.InstructorManager;
import kodlamaioNlayeredApp.core.logging.Logger;
import kodlamaioNlayeredApp.core.logging.MailLogger;
import kodlamaioNlayeredApp.core.logging.dbLogger;
import kodlamaioNlayeredApp.core.logging.smsLogger;
import kodlamaioNlayeredApp.dataAccess.hibernate.hibernateCategoryDao;
import kodlamaioNlayeredApp.dataAccess.hibernate.hibernateInstructorDao;
import kodlamaioNlayeredApp.dataAccess.jdbc.jdbcCourseDao;
import kodlamaioNlayeredApp.entities.Category;
import kodlamaioNlayeredApp.entities.Course;
import kodlamaioNlayeredApp.entities.Instructor;

public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor();
        instructor1.setId(1);
        instructor1.setName("");
        instructor1.setProfession("C# ve Java");
        instructor1.setCorporateMail("engindemirog@kodlama.io");

        Category category1 = new Category();
        category1.setCategoryId(1);
        category1.setCategoryName("C#");
        category1.setCategoryDescription("C# temel düzey ve orta düzey eğitim");
        Course course1 = new Course();
        course1.setCourseId(1);
        course1.setCourseName("Java Eğitim 100 Örnekli");
        course1.setCourseInstructor(instructor1);
        course1.setCoursePrice(-6);
        System.out.println("----------------- CATEGORY ADDED HIBERNATE----------------");
        CategoryManager categoryManager = new CategoryManager(new hibernateCategoryDao(),new Logger[]{new MailLogger(),new smsLogger()});
        categoryManager.add(category1);
        System.out.println("-----------------COURSE ADDED JDBC----------------");
        CourseManager courseManager = new CourseManager(new jdbcCourseDao(), new Logger[]{ new smsLogger(),new MailLogger(), new dbLogger()});
        courseManager.add(course1);
        System.out.println("-----------------INSTRUCTOR NOT ADDED HIBERNATE----------------");
        InstructorManager instructorManager = new InstructorManager(new hibernateInstructorDao(), new Logger[]{ new smsLogger(),new MailLogger(), new dbLogger()});
        instructorManager.add(instructor1);
    }
}
package kodlamaioNlayeredApp.dataAccess.hibernate;

import kodlamaioNlayeredApp.dataAccess.CourseDao;
import kodlamaioNlayeredApp.entities.Course;

public class hibernateCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("Hibernate ile kaydedildi.");

    }

    public void update(Course course) {
        System.out.println("Hibernate ile düzenlendi.");
    }
}

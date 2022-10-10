package kodlamaioNlayeredApp.dataAccess.jdbc;

import kodlamaioNlayeredApp.dataAccess.CourseDao;
import kodlamaioNlayeredApp.entities.Course;

public class jdbcCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("JDBC ile eklendi");

    }

    public void update(Course course) {
        System.out.println("JDBC ile düzenlendi.");

    }
}

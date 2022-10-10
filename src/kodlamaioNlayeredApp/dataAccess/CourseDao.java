package kodlamaioNlayeredApp.dataAccess;

import kodlamaioNlayeredApp.entities.Course;

public interface CourseDao {
    void add(Course course);
    void update(Course course);
}

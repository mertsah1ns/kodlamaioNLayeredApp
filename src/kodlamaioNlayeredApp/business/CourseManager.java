package kodlamaioNlayeredApp.business;

import kodlamaioNlayeredApp.core.logging.Logger;
import kodlamaioNlayeredApp.dataAccess.CourseDao;
import kodlamaioNlayeredApp.entities.Course;

public class CourseManager {
    CourseDao courseDao;
    Logger[] loggers;
    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course){
        if (course.getCoursePrice()< 0) {
            System.out.println("Kurs en az ücretsiz olabilir.");
        }else{
            for (Logger loggers:loggers
                 ) {
                loggers.log();
            }
            courseDao.add(course);
        }

    }
}

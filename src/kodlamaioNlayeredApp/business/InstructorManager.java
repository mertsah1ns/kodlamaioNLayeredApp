package kodlamaioNlayeredApp.business;

import kodlamaioNlayeredApp.core.logging.Logger;
import kodlamaioNlayeredApp.dataAccess.InstructorDao;
import kodlamaioNlayeredApp.entities.Instructor;

public class InstructorManager {
    public InstructorDao instructorDao;
    public Logger[] loggers;
    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao; this.loggers = loggers;
    }
    public void  add(Instructor instructor){
        if (instructor.getName() ==null || instructor.getName().isEmpty()){
            System.out.println("Eğitmen ismi boş olamaz");
        }else {
            for (Logger loggers: loggers
                 ) {
                loggers.log();
                instructorDao.add(instructor);
            }
        }
    }
}

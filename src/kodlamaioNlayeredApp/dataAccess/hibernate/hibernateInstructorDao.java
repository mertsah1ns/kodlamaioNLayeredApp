package kodlamaioNlayeredApp.dataAccess.hibernate;

import kodlamaioNlayeredApp.dataAccess.InstructorDao;
import kodlamaioNlayeredApp.entities.Instructor;

public class hibernateInstructorDao implements InstructorDao {
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile kaydedildi.");
    }

    public void update(Instructor instructor) {
        System.out.println("Hibernate ile kaydedildi.");
    }
}

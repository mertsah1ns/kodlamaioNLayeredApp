package kodlamaioNlayeredApp.dataAccess.jdbc;

import kodlamaioNlayeredApp.dataAccess.InstructorDao;
import kodlamaioNlayeredApp.entities.Instructor;

public class jdbcInstructorDao implements InstructorDao {

    public void add(Instructor instructor) {
        System.out.println("JDBC ile kaydedildi.");

    }

    public void update(Instructor instructor) {
        System.out.println("JDBC ile düzenlendi.");
    }
}

package kodlamaioNlayeredApp.dataAccess.jdbc;

import kodlamaioNlayeredApp.dataAccess.CategoryDao;
import kodlamaioNlayeredApp.entities.Category;

public class jdbcCategoryDao implements CategoryDao {
    public void add(Category category) {
        System.out.println("JDBC ile eklendi.");
    }

    public void update(Category category) {
        System.out.println("JDBC ile düzenlendi.");

    }
}

package kodlamaioNlayeredApp.dataAccess.hibernate;

import kodlamaioNlayeredApp.dataAccess.CategoryDao;
import kodlamaioNlayeredApp.entities.Category;

public class hibernateCategoryDao implements CategoryDao {

    public void add(Category category) {
        System.out.println("Hibernate ile eklendi");

    }

    public void update(Category category) {
        System.out.println("Hibernate ile düzenlendi.");

    }
}

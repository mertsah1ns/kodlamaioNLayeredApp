package kodlamaioNlayeredApp.dataAccess;

import kodlamaioNlayeredApp.entities.Category;

public interface CategoryDao {
    void add(Category category);
    void update(Category category);
}

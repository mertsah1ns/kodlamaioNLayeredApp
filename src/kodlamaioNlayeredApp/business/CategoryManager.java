package kodlamaioNlayeredApp.business;

import kodlamaioNlayeredApp.core.logging.Logger;
import kodlamaioNlayeredApp.dataAccess.CategoryDao;
import kodlamaioNlayeredApp.entities.Category;

import javax.swing.text.Caret;

public class CategoryManager {
    CategoryDao categoryDao;
    Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        if (category.getCategoryName() == null) {
            System.out.println("Kategori ismi boş olamaz.");
        } else {
            categoryDao.add(category);
            for (Logger logger : loggers
            ) {
                logger.log();
                categoryDao.add(category);
            }
        }
    }

    public void update(Category category) {

    }
}

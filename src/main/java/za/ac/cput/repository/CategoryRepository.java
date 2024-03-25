package za.ac.cput.repository;

import za.ac.cput.domain.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * CategoryRepository.java
 * This is the repository program
 * @author Thandolwethu Khoza (221797289)
 * Date: 24 March 2024
 */

public class CategoryRepository implements ICategoryRepository{
    private static ICategoryRepository categoryRepository = null;

    private List<Category> categoryList;

    public CategoryRepository() {
        categoryList = new ArrayList<Category>();
    }

    public static ICategoryRepository getCategoryRepository() {
        if (categoryRepository == null) {
            categoryRepository = new CategoryRepository();
        }
        return categoryRepository;
    }

    @Override
    public List<Category> getAll() {
        return categoryList;
    }

    @Override
    public Category create(Category category) {
        boolean success = categoryList.add(category);
        if (success)
            return category;
        return null;
    }

    @Override
    public Category read(String s) {
        return null;
    }

    public Category read(int id) {
        for (Category category : categoryList) {
            if (category.getCategoryID() == id)
                return category;
        }
        return null;
    }
    @Override
    public Category update(Category category) {
        String categoryID = String.valueOf(category.getCategoryID());
        if(delete(categoryID)) {
            if (categoryList.add(category))
                return category;
            else
                return null;
        }
        return null;
    }
    @Override
    public boolean delete(String id) {
        Category categoryToDelete = read(id);
        if (categoryToDelete == null)
            return false;
        return (categoryList.remove(categoryToDelete));
    }

}

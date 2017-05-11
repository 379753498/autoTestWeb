package com.quauq.autoTest.dao;

import java.util.List;

import com.quauq.autoTest.model.Category;

public interface CategoryDAO {
	List<Category> findCategoryListByUserId(int userId);
	int insertCategory(Category category);
	Category findCategoryById(int id);
	int updateCategory(Category category);
	int deleteCategory(int id);
	List<Category> findCategoryList(Category category);
}

package com.niit.ecommercebackend.dao;

import java.util.List;

import com.niit.ecommercebackend.model.Category;

public interface CategoryDAO {

	public void addCategory(Category p);
	public void updateCategory(Category p);
	public List<Category> listCategorys();
	public Category getCategoryById(int id);
	public void removeCategory(int id);

}
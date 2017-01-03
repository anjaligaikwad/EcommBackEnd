package com.niit.ecommercebackend.dao.Impl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommercebackend.dao.CategoryDAO;
import com.niit.ecommercebackend.model.Category;

@Repository("cDAO")
@Transactional
@EnableTransactionManagement

public class CategoryDAOImpl implements CategoryDAO {
	                                                                                      

		@Autowired
		SessionFactory sessionFactory;

		public void addCategory(Category c) {
			Session session=sessionFactory.getCurrentSession();
			session.persist(c);
			
		}

		public void updateCategory(Category c) {
			Session session=sessionFactory.getCurrentSession();
			session.update(c);
			
		}

		public List<Category> listCategorys() {
			Session session=sessionFactory.getCurrentSession();
			List<Category> categorys=session.createQuery("from Category").getResultList();
			return categorys;
		}

		public Category getCategoryById(int id) {
			Session session=sessionFactory.getCurrentSession();
			Category category=(Category)session.createQuery("from Category where id="+id).getSingleResult();
			return category;
		}

		public void removeCategory(int id) {
			Session session=sessionFactory.getCurrentSession();
			Category category=(Category)session.createQuery("from Category where id="+id).getSingleResult();
			session.delete(category);
			
		}

	}




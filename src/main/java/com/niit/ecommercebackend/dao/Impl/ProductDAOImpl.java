package com.niit.ecommercebackend.dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommercebackend.dao.ProductDAO;
import com.niit.ecommercebackend.model.Category;
import com.niit.ecommercebackend.model.Product;
import com.niit.ecommercebackend.model.Supplier;

@Repository("ProductDAO")
@Transactional
@EnableTransactionManagement
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void addProduct(Product p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);

	}

	public void updateProduct(Product p) {
		Session session = sessionFactory.getCurrentSession();
		session.update(p);

	}

	public List<Product> listProducts() {
		Session session = sessionFactory.getCurrentSession();
		List<Product> products = session.createQuery("from Product").getResultList();
		return products;
	}

	public Product getProductById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.createQuery("from Product where id=" + id).getSingleResult();
		return product;
	}

	public void removeProduct(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.createQuery("from Product where id=" + id).getSingleResult();
		session.delete(product);

	}

	public List<Category> listcatname() {
		String hql = "select categoryName from Category";
		Query query = sessionFactory.openSession().createQuery(hql);
		return query.list();
	}

	public List<Supplier> listsupname() {
		String hql = "select supplierName from Supplier";
		Query query = sessionFactory.openSession().createQuery(hql);
		return query.list();
	}

}

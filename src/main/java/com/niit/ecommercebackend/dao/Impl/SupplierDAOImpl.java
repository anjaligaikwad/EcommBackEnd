package com.niit.ecommercebackend.dao.Impl;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommercebackend.dao.SupplierDAO;
import com.niit.ecommercebackend.model.Supplier;

@Repository("sDAO")
@Transactional
@EnableTransactionManagement

public class SupplierDAOImpl implements SupplierDAO {
	

		@Autowired
		SessionFactory sessionFactory;

		public void addSupplier(Supplier s) {
			Session session=sessionFactory.getCurrentSession();
			session.persist(s);
			
		}

		public void updateSupplier(Supplier s) {
			Session session=sessionFactory.getCurrentSession();
			session.update(s);
			
		}

		public List<Supplier> listSuppliers() {
			Session session=sessionFactory.getCurrentSession();
			List<Supplier> suppliers=session.createQuery("from Supplier").getResultList();
			return suppliers;
		}

		public Supplier getSupplierById(int id) {
			Session session=sessionFactory.getCurrentSession();
			Supplier supplier=(Supplier)session.createQuery("from Supplier where id="+id).getSingleResult();
			return supplier;
		}

		public void removeSupplier(int id) {
			Session session=sessionFactory.getCurrentSession();
			Supplier supplier=(Supplier)session.createQuery("from Supplier where id="+id).getSingleResult();
			session.delete(supplier);
			
		}

	}




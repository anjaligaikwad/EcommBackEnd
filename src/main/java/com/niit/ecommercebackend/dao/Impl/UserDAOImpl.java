package com.niit.ecommercebackend.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommercebackend.dao.UserDAO;
import com.niit.ecommercebackend.model.Cart;
import com.niit.ecommercebackend.model.UserCustomer;

@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(UserCustomer user) {
		// sessionFactory.getCurrentSession().saveOrUpdate(user);
		Session session = sessionFactory.getCurrentSession();
		user.setUserrole("ROLE_USER");
//		user.setUserrole("ROLE_ADMIN");
		Cart cart = new Cart();
		user.setCart(cart);
		cart.setUsercustomer(user);
		session.saveOrUpdate(user);

	}

	@Transactional
	public void update(UserCustomer user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Transactional
	public void delete(int userId) {
		UserCustomer user = new UserCustomer();
		user.setUserid(userId);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Transactional
	public UserCustomer get(String username) {
		// String hql = "from UserDetails where id=" + "'" + id + "'";
		// Query query = (Query)
		// sessionFactory.getCurrentSession().createQuery(hql);
		// @SuppressWarnings("unchecked")
		// List<User> list = (List<User>) query.list();
		//
		// if (list != null && !list.isEmpty()) {
		// return list.get(0);
		//
		// Session session = this.sessionFactory.getCurrentSession();
		// UserCustomer user = (UserCustomer) session.load(UserCustomer.class,
		// new Integer(id));
		//// logger.info("USer loaded successfully, User details="+User);
		// return user;
		// }

		Session session = this.sessionFactory.openSession();
		Query query = session.createQuery("from UserCustomer where username=?");
		query.setString(0, username);
		UserCustomer user = (UserCustomer) query.uniqueResult();
		// logger.info("USer loaded successfully, User details="+User);
		// session.flush();
		// session.close();
		return user;
	}
}

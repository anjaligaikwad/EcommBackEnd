package com.niit.ecommercebackend.dao.Impl;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecommercebackend.dao.UserDAO;
import com.niit.ecommercebackend.model.User;


@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(User user) {
//		sessionFactory.getCurrentSession().saveOrUpdate(user);
	    Session session = sessionFactory.getCurrentSession();
//	    user.setUser_role("ROLE_USER");
	    user.setUser_role("ROLE_ADMIN");
	    session.saveOrUpdate(user);

	}
	@Transactional
	public void update(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	@Transactional
	public void delete(int userId) {
		User user = new User();
		user.setUser_Id(userId);
		sessionFactory.getCurrentSession().delete(user);
	}

	@Transactional
	public User get(String id) {
//		String hql = "from UserDetails where id=" + "'" + id + "'";
//		Query query = (Query) sessionFactory.getCurrentSession().createQuery(hql);
//		@SuppressWarnings("unchecked")
//		List<User> list = (List<User>) query.list();
//
//		if (list != null && !list.isEmpty()) {
//			return list.get(0);
		
		Session session = this.sessionFactory.getCurrentSession();		
		User user = (User) session.load(User.class, new Integer(id));
//		logger.info("USer loaded successfully, User details="+User);
		return user;
	}
	
	

	
	}

	

package com.niit.ecommercebackend.dao;
import com.niit.ecommercebackend.model.UserCustomer;


	public interface UserDAO {

		public void save(UserCustomer user);

		public void update(UserCustomer user);

		public void delete(int userid);

		public UserCustomer get(String username);

	}




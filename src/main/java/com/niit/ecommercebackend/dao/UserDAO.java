package com.niit.ecommercebackend.dao;
import java.util.List;
import com.niit.ecommercebackend.model.User;


	public interface UserDAO {

		public void save(User user);

		public void update(User user);

		public void delete(int userid);

		public User get(String userid);

	}




package com.niit.ecommercebackend.dao;

import com.niit.ecommercebackend.model.CustomerOrder;

public interface CustomerOrderDAO {

	void addCustomerOrder(CustomerOrder customerOrder);

	int getCustomerOrderGrandTotal(int cartId);

}

package com.niit.ecommercebackend.dao;

import com.niit.ecommercebackend.model.Cart;
import com.niit.ecommercebackend.model.CartItem;

public interface CartItemDAO {

	void addCartItem(CartItem cartItem);
	void removeCartItem(int cartitemid);
	void removeAllCartItems(Cart cart);
}
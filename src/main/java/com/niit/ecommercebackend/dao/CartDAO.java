package com.niit.ecommercebackend.dao;

import java.io.IOException;

import com.niit.ecommercebackend.model.Cart;

public interface CartDAO {
Cart getCartByCartId(int cartId);
Cart validate(int cartId) throws IOException;
void update(Cart cart);
}

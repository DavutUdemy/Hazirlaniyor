package com.hazir.Hazirlaniyor.business.abstracts;

import com.hazir.Hazirlaniyor.entity.concretes.Cart;
import com.hazir.Hazirlaniyor.entity.concretes.Product;
import com.hazir.Hazirlaniyor.entity.concretes.ProductCategory;

import java.util.List;

public interface CartService {
    List<Cart> getAllCarts();
    List<Cart> findCartByUserEmail(String email);
    void addToCart(Cart cart);
    void deleteCartById(Long Id);
 }

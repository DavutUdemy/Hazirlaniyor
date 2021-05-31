package com.hazir.Hazirlaniyor.business.concretes;

import com.hazir.Hazirlaniyor.business.abstracts.CartService;
import com.hazir.Hazirlaniyor.dataAccess.abstracts.CartDao;
import com.hazir.Hazirlaniyor.entity.concretes.Cart;
import com.hazir.Hazirlaniyor.entity.concretes.Product;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@AllArgsConstructor
@Service
public class CartManager implements CartService {
    private final CartDao cartDao;

    @Override
    public List<Cart> getAllCarts() {
        return this.cartDao.findAll();
    }

    @Override
    public List<Cart> findCartByUserEmail(String email) {
        return this.cartDao.findCartByEmail (email);
    }


    @Override
    public void addToCart(Cart cart) {
   this.cartDao.save(cart);
    }

    @Override
    public void deleteCartById(Long Id) {
this.cartDao.deleteById(Id);
    }
}
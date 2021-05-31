package com.hazir.Hazirlaniyor.api.controllers;

import com.hazir.Hazirlaniyor.business.concretes.CartManager;
import com.hazir.Hazirlaniyor.business.concretes.StripeManager;
import com.hazir.Hazirlaniyor.entity.concretes.Cart;
import com.hazir.Hazirlaniyor.entity.concretes.ChargeRequest;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

import lombok.AllArgsConstructor;
import lombok.extern.java.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Log
@RestController
@RequestMapping("api/v1/Cart")
@AllArgsConstructor

public class CartController {
    private final CartManager cartManager;
    @GetMapping
    public List<Cart> getAllCarts(){
        return this.cartManager.getAllCarts();
    }
    @GetMapping(path = "{email}")
    public List<Cart>findCartByUserEmail(@PathVariable("email")String email){
        return this.cartManager.findCartByUserEmail(email);
    }
    @DeleteMapping(path ="{id}")
    public void deleteCartById(@PathVariable("id")Long Id){
          this.cartManager.deleteCartById(Id);
    }
    @PostMapping
    public void addtoCart(@RequestBody Cart cart){
          this.cartManager.addToCart(cart);
    }

}

package com.hazir.Hazirlaniyor.dataAccess.abstracts;

import com.hazir.Hazirlaniyor.entity.concretes.Cart;
import com.hazir.Hazirlaniyor.entity.concretes.Product;
import com.hazir.Hazirlaniyor.entity.concretes.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends JpaRepository<Cart,Long> {
    @Query("SELECT s FROM Cart s WHERE s.email=?1")
    List<Cart> findCartByEmail(String email);


}

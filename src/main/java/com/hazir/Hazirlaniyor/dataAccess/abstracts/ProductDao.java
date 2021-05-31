package com.hazir.Hazirlaniyor.dataAccess.abstracts;

import com.hazir.Hazirlaniyor.entity.concretes.Product;
import com.hazir.Hazirlaniyor.entity.concretes.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
    @Query("SELECT s FROM Product s WHERE s.productCategory=?1")
    List<Product> findProductByCategory(ProductCategory productCategory);


}

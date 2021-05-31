package com.hazir.Hazirlaniyor.entity.concretes;

import javax.persistence.*;

import lombok.AllArgsConstructor;

@Entity
@Table

public class Cart {
    @SequenceGenerator(
            name = "cart_sequence",
            sequenceName = "cart_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cart_sequence"
    )

    private Long CartId;
	private Integer productPrice;
private Integer quantity;
	@Transient
     private Integer totalPrice;
    private String email;
    private String productName;
    private String productDescription;
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
    private Integer unitsInStock;
    public Cart() {

    }

	public Cart(Integer productPrice, Integer quantity, Integer totalPrice, String email, String productName, String productDescription, ProductCategory productCategory, Integer unitsInStock) {
		this.productPrice = productPrice;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.email = email;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productCategory = productCategory;
		this.unitsInStock = unitsInStock;
	}

	public Long getCartId() {
		return CartId;
	}

	public void setCartId(Long cartId) {
		CartId = cartId;
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Integer getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(Integer unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
}

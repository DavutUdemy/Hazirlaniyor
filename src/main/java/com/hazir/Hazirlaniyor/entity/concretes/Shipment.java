package com.hazir.Hazirlaniyor.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component

@Entity
@Table
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Shipment {
	@SequenceGenerator(
			name = "shipment_sequence",
			sequenceName = "shipment_sequence",
			allocationSize = 1
	)
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "shipment_sequence"
	)
	private Long          Id;
	private LocalDateTime paymentDate;
	@OneToMany
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name="propertysubfkid")

	private List<Cart>    cart;
	private String        shipmentStatus;
	private String        firstName;
	private String        lastName;
	private String        postalCode;
	private String        fullAdress;
	private String        phoneNumber;
	private String        email;
 	private Boolean cancelOrder = false;

	public Shipment() {
	}

	public Shipment(Long id, LocalDateTime paymentDate, List<Cart> cart, String shipmentStatus, String firstName, String lastName, String postalCode, String fullAdress, String phoneNumber, String email, Boolean cancelOrder) {
		Id = id;
		this.paymentDate = paymentDate;
		this.cart = cart;
		this.shipmentStatus = shipmentStatus;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.fullAdress = fullAdress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.cancelOrder = cancelOrder;
	}

	public Shipment(LocalDateTime paymentDate, List<Cart> cart, String shipmentStatus, String firstName, String lastName, String postalCode, String fullAdress, String phoneNumber, String email) {
		this.paymentDate = paymentDate;
		this.cart = cart;
		this.shipmentStatus = shipmentStatus;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.fullAdress = fullAdress;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Shipment(LocalDateTime paymentDate, List<Cart> cart, String shipmentStatus, String firstName, String lastName, String postalCode, String fullAdress, String phoneNumber, String email, Boolean cancelOrder) {
		this.paymentDate = paymentDate;
		this.cart = cart;
		this.shipmentStatus = shipmentStatus;
		this.firstName = firstName;
		this.lastName = lastName;
		this.postalCode = postalCode;
		this.fullAdress = fullAdress;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.cancelOrder = cancelOrder;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}

	public List<Cart> getCart() {
		return cart;
	}

	public void setCart(List<Cart> cart) {
		this.cart = cart;
	}

	public String getShipmentStatus() {
		return shipmentStatus;
	}

	public void setShipmentStatus(String shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getFullAdress() {
		return fullAdress;
	}

	public void setFullAdress(String fullAdress) {
		this.fullAdress = fullAdress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getCancelOrder() {
		return cancelOrder;
	}

	public void setCancelOrder(Boolean cancelOrder) {
		this.cancelOrder = cancelOrder;
	}
}



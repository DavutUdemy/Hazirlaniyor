package com.hazir.Hazirlaniyor.entity.concretes;

import lombok.Data;
@Data
public class ChargeRequest {

	public enum Currency {
		GEL, USD;
	}

	private String   description;
	private int      amount;
	private Currency currency;
	private String   stripeEmail;
	private String   stripeToken;
}
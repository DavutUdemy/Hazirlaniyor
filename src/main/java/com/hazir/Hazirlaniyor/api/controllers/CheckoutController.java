package com.hazir.Hazirlaniyor.api.controllers;

import com.hazir.Hazirlaniyor.entity.concretes.ChargeRequest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class CheckoutController {
	@Value("${STRIPE_PUBLIC_KEY}")
	private String stripePublicKey;

	@RequestMapping("/checkout")
	public String checkout(Model model) {
		model.addAttribute ("amount", 50 * 100); // in cents
		model.addAttribute ("stripePublicKey", stripePublicKey);
		model.addAttribute ("currency", ChargeRequest.Currency.USD);
		return "checkout";
	}
}
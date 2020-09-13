package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pfe.kounouz.travel.entitie.Payment;
import com.pfe.kounouz.travel.service.PaymentService;

@RequestMapping
@RestController
public class PaymentController {
	@Autowired
	private PaymentService PaymentService;

	@RequestMapping(value = "/Payment/PaymentManager", method = RequestMethod.GET)
	public List<Payment> findAll() {
		return PaymentService.findAllPayment();
	}

	@RequestMapping(value = "/Payment/PaymentById/{id}", method = RequestMethod.GET)
	public Payment getPaymentById(@PathVariable("id") Long id) {
		return PaymentService.findOnePayment(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Payment/deletePayment")
	public void deletePayment(@RequestBody Payment Payment) {
		PaymentService.deletePayment(Payment);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Payment/savePayment")
	public void savePayment(@RequestBody Payment Payment) {
		PaymentService.savePayment(Payment);

	}
}

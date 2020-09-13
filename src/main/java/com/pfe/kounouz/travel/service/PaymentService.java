package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Payment;

public interface PaymentService {
	
	public void deletePayment(Payment Payment);

	public List<Payment> findAllPayment();

	public Payment findOnePayment(Long id);

	public Payment savePayment(Payment Payment);

}

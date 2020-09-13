package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.repository.PaymentRepository;
import com.pfe.kounouz.travel.entitie.Payment;
import com.pfe.kounouz.travel.service.PaymentService;
@Service
public class PaymentServiceImpl implements PaymentService{
	@Autowired
     PaymentRepository  PaymentRepository;
  
	@Override
	public void deletePayment(Payment Payment) {
		PaymentRepository.delete(Payment);
    	
	}

	@Override
	public List<Payment> findAllPayment() {
		// TODO Auto-generated method stub
		return PaymentRepository.findAll();
	}

	@Override
	public Payment findOnePayment(Long id) {
		// TODO Auto-generated method stub
		return PaymentRepository.findPaymentById(id);
	}

	@Override
	public Payment savePayment(Payment Payment) {
		// TODO Auto-generated method stub
		return PaymentRepository.save(Payment);
	}

}

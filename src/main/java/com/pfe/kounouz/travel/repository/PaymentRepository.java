package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Payment;
@Repository
public interface PaymentRepository extends JpaRepository<Payment , Long>{
	Payment findPaymentById(long id);

}

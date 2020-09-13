package com.pfe.kounouz.travel.srviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pfe.kounouz.travel.entitie.Reservation;
import com.pfe.kounouz.travel.repository.ReservationRepository;
import com.pfe.kounouz.travel.service.ReservationService;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationRepository ReservationRepository ;

	@Override
	public List<Reservation> findAllReservation() {
		return ReservationRepository.findAll();
	}

	@Override
	public Reservation findOneReservation(Long id) {
		return ReservationRepository.findOneReservvationsById(id);
	}

	@Override
	public void deleteReservation(Reservation Reservation) {
		ReservationRepository.delete(Reservation);
		
	}

	@Override
	public Reservation saveReservation(Reservation Reservation) {
		return ReservationRepository.save(Reservation);
	}

}

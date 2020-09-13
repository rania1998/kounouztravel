package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Reservation;

public interface ReservationService {

	public List<Reservation> findAllReservation();

	public Reservation findOneReservation(Long id);

	public void deleteReservation(Reservation Reservation);

	public Reservation saveReservation(Reservation Reservation);

}

package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Reservation;
import com.pfe.kounouz.travel.service.ReservationService;


@RequestMapping
@RestController
public class ReservationController {
	@Autowired
	private ReservationService  ReservationService;


	@RequestMapping(value = "/Reservation/ReservationManager", method = RequestMethod.GET)
	public List<Reservation> findAll() {
		return ReservationService.findAllReservation();
	}

	@RequestMapping(value = "/Reservation/ReservationById/{id}", method = RequestMethod.GET)
	public Reservation getReservationById(@PathVariable("id") Long id) {
		return ReservationService.findOneReservation(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Reservation/deleteReservation")
	public void deleteReservation(@RequestBody Reservation Reservation) {
		ReservationService.deleteReservation(Reservation);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Reservation/saveReservation")
	public void saveReservation(@RequestBody Reservation Reservation) {
		ReservationService.saveReservation(Reservation);

	}

}

package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation ,Long> {
	Reservation findOneReservvationsById(Long id);

}

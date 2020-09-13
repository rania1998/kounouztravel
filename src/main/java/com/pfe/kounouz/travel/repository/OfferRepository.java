package com.pfe.kounouz.travel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfe.kounouz.travel.entitie.Offer;
@Repository
public interface OfferRepository extends JpaRepository <Offer ,Long> {
	Offer findOfferById(long id );
}

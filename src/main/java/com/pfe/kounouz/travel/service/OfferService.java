package com.pfe.kounouz.travel.service;

import java.util.List;

import com.pfe.kounouz.travel.entitie.Offer;

public interface OfferService {

	public Offer findOneOffer(Long id);

	public List<Offer> findAllOffer();

	public Offer saveOffer(Offer Offer);

	public void deleteOffer(Offer Offer);
}

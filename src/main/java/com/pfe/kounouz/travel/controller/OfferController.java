package com.pfe.kounouz.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.kounouz.travel.entitie.Offer;
import com.pfe.kounouz.travel.service.OfferService;

@RequestMapping
@RestController
public class OfferController {
	
	@Autowired
	private OfferService  OfferService ;
	
	@RequestMapping(value = "/Offer/OfferManager", method = RequestMethod.GET)
	public List<Offer> findAll() {
		return OfferService.findAllOffer();
	}

	@RequestMapping(value = "/Offer/OfferById/{id}", method = RequestMethod.GET)
	public Offer getOfferById(@PathVariable("id") Long id) {
		return OfferService.findOneOffer(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/Offer/deleteOffer")
	public void deleteOffer(@RequestBody Offer Offer) {
		OfferService.deleteOffer(Offer);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/Offer/saveOffer")
	public void saveOffer(@RequestBody Offer Offer) {
		OfferService.saveOffer(Offer);


}}

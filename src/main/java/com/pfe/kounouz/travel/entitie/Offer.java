package com.pfe.kounouz.travel.entitie;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Offer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "name_offers")
	private String name_offers;

	@Column(name = "begin_date")
	private Date begin_date;

	@Column(name = "end_date")
	private Date end_date;

	@Column(name = "description")
	private String description;

	@Column(name = "prices")
	private double prices;

	@Column(name = "types")
	private String types;

	@Column(name = "quantity")
	private int quantity;
	
	@ManyToMany
	 private List<Reservation> Reservation ;

	@OneToOne
	private UnderCategory underCategory ;


}

package com.pfe.kounouz.travel.entitie;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "nb_place")
	private Long nb_place;

	@Column(name = "date_reservation")
	private Date date_reservation;

	@Column(name = "date_validation")
	private Date date_validation;

	@Column(name = "dure_sejour")
	private Date dure_sej;

	@Column(name = "Ville")
	private String Ville;

	@Enumerated
	private Status Status;
	
	//@ManyToMany(mappedBy="reservation", fetch=FetchType.EAGER)
	//@JoinTable(name="ProcessInstance",
	//joinColumns = { @JoinColumns ( name="Reservation_id")},
	//inverseJoinColumns = { @JoinColumns ( name="Offer_id")})
	// private List<Offer> Offer ;
	@ManyToOne
	private ProcessInstance cProcessInstancelient;

	@ManyToMany
	 private List<Users> Users ;

}

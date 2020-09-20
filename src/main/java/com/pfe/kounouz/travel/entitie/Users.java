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
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	private String login;
	private String password;
	private String email;
	@Enumerated
	private Role role;
	

	@Column(name = "cin",nullable = true)
	private int cin;
	@Column(name = "num",nullable = true)
	private String num;
	@Column(name = "date_recrutment",nullable = true)
	private Date date_recrutment ;
	@Column(name = "firstname",nullable = true)
	private String firstname;
	@Column(name = "lastname",nullable = true)
	private String lastname;
	@Column(name = "Adresse",nullable = true)
	private String Adresse;
	
	//@OneToMany (mappedBy="users", fetch=FetchType.EAGER)
	// private List<Reservation> Reservation ;
	

}

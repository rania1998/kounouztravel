package com.pfe.kounouz.travel.entitie;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CreditCarte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	  @Column(name = "num_carte")
	    private String num_carte;
	  
	  @Column(name = "type_carte")
	    private String type_carte;
	  
	  @Column(name = "cryptogramme")
	    private String cryptogramme;
	  
	  @Column(name = "date_expiration")
	    private Date  date_expiration;

}

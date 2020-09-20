package com.pfe.kounouz.travel.entitie;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@PrimaryKeyJoinColumn(name = "id")
public class ProcessInstance {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
    
	 private Integer offerid;
	 private Integer reservationid ;
     
	 private Integer agentid;

     private Integer clientid;
     
     @Enumerated
 	private NodeInstance  NodeInstance;
    
     @OneToMany(mappedBy="ProcessInstance")
     private List<Reservation> Reservation ;
     
     @OneToMany(mappedBy="ProcessInstance")
     private List<Offer> Offer ;

	
	
	

}

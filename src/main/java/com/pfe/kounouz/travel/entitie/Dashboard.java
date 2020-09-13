package com.pfe.kounouz.travel.entitie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
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
public class Dashboard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Enumerated
	private SupervitionType supervitionType;
	
	@Column(name = "ranges")
	private Long ranges;
	
	@Column(name = "score")
	private Long score;
	
	@Column(name = "value")
	private Long value;
	
	@Column(name = "counted")
	private Long counted;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "statisticType")
	private String statisticType;
	
	
	
}

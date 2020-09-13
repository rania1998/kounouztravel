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
public class WorkflowConfig {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "configType")
	private String configType;

	@Column(name = "name")
	private String name;

	@Column(name = "unAutorizedRole")
	private Role unAutorizedRole;

	@Column(name = "AutorizedRole")
	private Role AutorizedRole;

	@Column(name = "beginDate")
	private Date beginDate;

	@Column(name = "endDate")
	private Date endDate;

	@Column(name = "desription")
	private String desription;

}

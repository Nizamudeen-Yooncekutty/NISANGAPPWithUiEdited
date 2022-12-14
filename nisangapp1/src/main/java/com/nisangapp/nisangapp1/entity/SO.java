package com.nisangapp.nisangapp1.entity;



import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "edge")
public class SO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "requiredSkills", nullable = false)
	private String requiredSkills;
	@Column(name = "location", nullable = false)
	private String location;
	@Column(name = "hmDetails", nullable = false)
	private String hmDetails;
	@Column(name = "roleName", nullable = false)
	private String roleName;
	@Column(name = "JD", nullable = false)
	private String JD;
	
	public SO() {
		super();
	}

	public SO(String requiredSkills, String location, String hmDetails, String roleName, String jD) {
		super();
		this.requiredSkills = requiredSkills;
		this.location = location;
		this.hmDetails = hmDetails;
		this.roleName = roleName;
		JD = jD;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequiredSkills() {
		return requiredSkills;
	}

	public void setRequiredSkills(String requiredSkills) {
		this.requiredSkills = requiredSkills;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getHmDetails() {
		return hmDetails;
	}

	public void setHmDetails(String hmDetails) {
		this.hmDetails = hmDetails;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getJD() {
		return JD;
	}

	public void setJD(String jD) {
		JD = jD;
	}

	@Override
	public String toString() {
		return "So [id=" + id + ", requiredSkills=" + requiredSkills + ", location=" + location + ", hmDetails="
				+ hmDetails + ", roleName=" + roleName + ", JD=" + JD + "]";
	}
	}

package com.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="apartment")
public class Apartment implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String apartmentname;
	private boolean active;
	private String area;
	private String city;
	private String state;
	
	
	public Apartment() { }

    @Id
	@Column(name="id", nullable=false, unique=true, updatable=false,insertable=false)
	@SequenceGenerator(name="Apartment_ID_GENERATOR", sequenceName="apartmentseq", initialValue=1, allocationSize=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Apartment_ID_GENERATOR")
	
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApartmentname() {
		return apartmentname;
	}
	public void setApartmentname(String apartmentname) {
		this.apartmentname = apartmentname;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
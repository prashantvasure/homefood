package com.pojo;
import com.model.Apartment;

public class ApartmentPojo {
	
	private int id;
	private String apartmentname;
	private boolean active;
	private String area;
	private String city;
	private String state;
	
	public Apartment getApartmentConvetor(ApartmentPojo apartmentPojo) {
		Apartment apartment = new Apartment();
		apartment.setActive(apartmentPojo.active);
		apartment.setApartmentname(apartmentPojo.apartmentname);
		apartment.setArea(apartmentPojo.area);
		apartment.setCity(apartmentPojo.city);
		apartment.setState(apartmentPojo.state);
		return apartment;
		
	}
	
	public int getId() {
		return id;
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
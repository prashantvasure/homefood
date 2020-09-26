package com.pojo;
import java.io.Serializable;

import com.model.Contact;

public class ContactPojo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String houseno;
	private String buildingname;
	private long mobile;
	private long alteranteno;
	private String area;
	private String city;
	private String state;
	private int userid;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

	public String getBuildingname() {
		return buildingname;
	}

	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getAlteranteno() {
		return alteranteno;
	}

	public void setAlteranteno(long alteranteno) {
		this.alteranteno = alteranteno;
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

	public Contact getContactConvetor(ContactPojo contactPojo) {
		Contact contact = new Contact();
		contact.setAlteranteno(contactPojo.getAlteranteno());
		contact.setArea(contactPojo.getArea());
		contact.setBuildingname(contactPojo.getBuildingname());
		contact.setCity(contactPojo.getCity());
		contact.setHouseno(contactPojo.getHouseno());
		contact.setMobile(contactPojo.getMobile());
		contact.setState(contactPojo.getState());
		return contact;
		
		
	}
}
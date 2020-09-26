package com.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="contact")
public class Contact implements Serializable {
	
	
	private Users user;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userid")
		public Users getUser() {
		return this.user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String houseno;
	private String buildingname;
	private long mobile;
	private long alteranteno;
	private String area;
	private String city;
	private String state;
	
	
//	private Users user;
	
    public Contact() { }

    @Id
	@Column(name="id", nullable=false, unique=true, updatable=false,insertable=false)
	@SequenceGenerator(name="Contact_ID_GENERATOR", sequenceName="contactseq", initialValue=1, allocationSize=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Contact_ID_GENERATOR")
	
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

	
	
}
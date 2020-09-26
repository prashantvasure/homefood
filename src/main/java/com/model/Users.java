package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name="users")
public class Users implements Serializable  {

	
	private Contact contacts;
	@OneToOne(mappedBy="user")
	public Contact getContacts() {
	return this.contacts;
	}
	public void setContacts(Contact contacts) {this.contacts = contacts;}

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Userseq")
	@SequenceGenerator(name="Userseq", sequenceName="userseq", allocationSize=20)
	private int id;
	private byte gender;
	private int activationcode;
	private boolean locked;
	private boolean activation;
	private boolean deactive;
	private boolean deleted; 

	private Timestamp createdat;
	private String firstname;
	private String passwords;
	private String email;
	private String lastname;
	private Timestamp updatedat;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte getGender() {
		return gender;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public int getActivationcode() {
		return activationcode;
	}
	public void setActivationcode(int activationcode) {
		this.activationcode = activationcode;
	}
	public boolean isLocked() {
		return locked;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
	public boolean isActivation() {
		return activation;
	}
	public void setActivation(boolean activation) {
		this.activation = activation;
	}
	public boolean isDeactive() {
		return deactive;
	}
	public void setDeactive(boolean deactive) {
		this.deactive = deactive;
	}
	public boolean isDeleted() {
		return deleted;
	}
	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Timestamp getCreatedat() {
		return createdat;
	}
	public void setCreatedat(Timestamp createdat) {
		this.createdat = createdat;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Timestamp getUpdatedat() {
		return updatedat;
	}
	public void setUpdatedat(Timestamp updatedat) {
		this.updatedat = updatedat;
	}

/*	private List<Items> items;

	@OneToMany(targetEntity=Items.class,mappedBy="userid",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	public List<Items> getItems() {
		return items;
	}


	public void setItems(List<Items> items) {
		this.items = items;
	}
	private List<Items> items;
		
	@OneToOne( fetch= FetchType.EAGER )
    @JoinColumn( name="id" )
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}

	private List<Items> items;
	
	@OneToMany(targetEntity=Items.class, mappedBy="users", fetch=FetchType.LAZY)  //sender is message(c)filed
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}

	private Contact contacts;
	@OneToOne(mappedBy="user")
	public Contact getContacts() {return this.contacts;}
	public void setContacts(Contact contacts) {this.contacts = contacts;}
 
	private List<Request> sentRequest;
	private List<Request> receivedRequest;

	@OneToMany(targetEntity=Request.class, mappedBy="sender", fetch=FetchType.LAZY)
	public List<Request> getSentRequest() {return sentRequest;}
	public void setSentRequest(List<Request> sentRequest) {this.sentRequest = sentRequest;}

	@OneToMany(targetEntity=Request.class, mappedBy="receiver", fetch=FetchType.LAZY)
	public List<Request> getReceivedRequest() {return receivedRequest;}
	public void setReceivedRequest(List<Request> receivedRequest) {this.receivedRequest = receivedRequest;}
*/
	
}
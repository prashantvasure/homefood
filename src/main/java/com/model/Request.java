package com.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



/**
 * The persistent class for the requests database table.
 * 
 */
@Entity
@Table(name="requests")
public class Request implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private Users sender;
	private Users receiver;
	@Id
	@Column(name="id", nullable=false, unique=true, updatable=false,insertable=false)
	@SequenceGenerator(name="Request_ID_GENERATOR", sequenceName="requestseq", initialValue=1, allocationSize=10)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="Request_ID_GENERATOR")

	public int getId() {return this.id;}
	public void setId(int id) {	this.id = id;}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="receid")
	public Users getReceiver() {return receiver;}
	public void setReceiver(Users receiver) {this.receiver = receiver;}
	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sendid")	
	public Users getSender() {return sender;}
	public void setSender(Users sender) {this.sender = sender;}
}
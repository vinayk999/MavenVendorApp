package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven_custtab")
public class Customer {

	@Id
	@Column(name="cid")
	private int custId;
	@Column(name="cname")
	private String custName;
	@Column(name="cnumber")
	private String custCntNumber;
	@Column(name="cemail")
	private String custEmail;
	@Column(name="caddr")
	private String custAddr;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCustCntNumber() {
		return custCntNumber;
	}
	public void setCustCntNumber(String custCntNumber) {
		this.custCntNumber = custCntNumber;
	}
	public String getCustEmail() {
		return custEmail;
	}
	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}
	public String getCustAddr() {
		return custAddr;
	}
	public void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName
				+ ", custCntNumber=" + custCntNumber + ", custEmail="
				+ custEmail + ", custAddr=" + custAddr + "]";
	}
	public Customer() {
		super();
	}
	
}

package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven_custtab")
public class Customer {

	@Id
	@Column(name="name")
	private String custName;
	@Column(name="number")
	private String custCntNumber;
	@Column(name="email")
	private String custEmail;
	@Column(name="addr")
	private String custAddr;
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
		return "Customer [custName=" + custName + ", custCntNumber="
				+ custCntNumber + ", custEmail=" + custEmail + ", custAddr="
				+ custAddr + "]";
	}
	public Customer() {
		super();
	}
	
}

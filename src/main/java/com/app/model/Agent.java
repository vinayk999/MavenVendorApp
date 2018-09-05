package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven_agenttab")
public class Agent {

	@Id
	@Column(name="fname")
	private String agentFirstName;
	@Column(name="lname")
	private String agentLastName;
	@Column(name="mobile")
	private String agentMobileNumber;
	@Column(name="email")
	private String agentEmail;
	@Column(name="addr")
	private String agentAddr;
	public String getAgentFirstName() {
		return agentFirstName;
	}
	public void setAgentFirstName(String agentFirstName) {
		this.agentFirstName = agentFirstName;
	}
	public String getAgentLastName() {
		return agentLastName;
	}
	public void setAgentLastName(String agentLastName) {
		this.agentLastName = agentLastName;
	}
	public String getAgentMobileNumber() {
		return agentMobileNumber;
	}
	public void setAgentMobileNumber(String agentMobileNumber) {
		this.agentMobileNumber = agentMobileNumber;
	}
	public String getAgentEmail() {
		return agentEmail;
	}
	public void setAgentEmail(String agentEmail) {
		this.agentEmail = agentEmail;
	}
	public String getAgentAddr() {
		return agentAddr;
	}
	public void setAgentAddr(String agentAddr) {
		this.agentAddr = agentAddr;
	}
	@Override
	public String toString() {
		return "Agent [agentFirstName=" + agentFirstName + ", agentLastName="
				+ agentLastName + ", agentMobileNumber=" + agentMobileNumber
				+ ", agentEmail=" + agentEmail + ", agentAddr=" + agentAddr
				+ "]";
	}
	public Agent() {
		super();
	}


}

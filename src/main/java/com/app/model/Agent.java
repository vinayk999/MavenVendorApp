package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="maven_agenttab")
public class Agent {

	@Id
	@Column(name="aid")
	private int agentId;
	@Column(name="afname")
	private String agentFirstName;
	public int getAgentId() {
		return agentId;
	}
	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}
	@Column(name="alname")
	private String agentLastName;
	@Column(name="amobile")
	private String agentMobileNumber;
	@Column(name="aemail")
	private String agentEmail;
	@Column(name="aaddr")
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
		return "Agent [agentId=" + agentId + ", agentFirstName="
				+ agentFirstName + ", agentLastName=" + agentLastName
				+ ", agentMobileNumber=" + agentMobileNumber + ", agentEmail="
				+ agentEmail + ", agentAddr=" + agentAddr + "]";
	}
	public Agent() {
		super();
	}


}

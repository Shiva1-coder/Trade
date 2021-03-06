package com.dbs.trade.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Client {
	@Id
	private String clientId;
	@Column(nullable=false)
	private String clientName;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private Custodian custodian;
	@Column(nullable=false)
	private int txnLimit;
	
	public Client() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Client(String clientId, String clientName, Custodian custodian, int txnLimit) {
		super();
		this.clientId = clientId;
		this.clientName = clientName;
		this.custodian = custodian;
		this.txnLimit = txnLimit;
	}



	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Custodian getCustodian() {
		return custodian;
	}

	public void setCustodian(Custodian custodian) {
		this.custodian = custodian;
	}

	public int getTxnLimit() {
		return txnLimit;
	}

	public void setTxnLimit(int txnLimit) {
		this.txnLimit = txnLimit;
	}



	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", custodian=" + custodian
				+ ", txnLimit=" + txnLimit + "]";
	}
	
	

}

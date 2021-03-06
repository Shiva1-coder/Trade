package com.dbs.trade.beans;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int transactionId;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private BuyOrder buyOrder;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(nullable=false)
	private SellOrder sellOrder;
	@Column(nullable=false)
	private double price;
	@Column(nullable=false)
	private int quantity;
	
	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public Transaction(int transactionId, BuyOrder buyOrder, SellOrder sellOrder, double price, int quantity) {
		super();
		this.transactionId = transactionId;
		this.buyOrder = buyOrder;
		this.sellOrder = sellOrder;
		this.price = price;
		this.quantity = quantity;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public BuyOrder getBuyOrder() {
		return buyOrder;
	}

	public void setBuyOrder(BuyOrder buyOrder) {
		this.buyOrder = buyOrder;
	}

	public SellOrder getSellOrder() {
		return sellOrder;
	}

	public void setSellOrder(SellOrder sellOrder) {
		this.sellOrder = sellOrder;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", buyOrder=" + buyOrder + ", sellOrder=" + sellOrder
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}

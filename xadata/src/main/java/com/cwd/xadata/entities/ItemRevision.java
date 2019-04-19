package com.cwd.xadata.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
 
 
@Entity
@Table(name="itemrevision")
@Data
public class ItemRevision {
	
	
	@EmbeddedId
	private ItemRevisionIdentity itemRevisionIdentity;

	@Column(name="itemdescription")
	private String itemdescription;
	
	@Column(name="cost")
	private double cost;
	

	@Column(name="price")
	private double price;

	
	private ItemRevision() {}


	public ItemRevisionIdentity getItemRevisionIdentity() {
		return itemRevisionIdentity;
	}


	public void setItemRevisionIdentity(ItemRevisionIdentity itemRevisionIdentity) {
		this.itemRevisionIdentity = itemRevisionIdentity;
	}


	public String getItemdescription() {
		return itemdescription;
	}


	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
		
	

}

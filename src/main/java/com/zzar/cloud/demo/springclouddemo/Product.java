package com.zzar.cloud.demo.springclouddemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="product")
public class Product {
	@Id
	int id;
	@NotBlank
	String name;
	int qty;
	Double unitPrice;
	
	public Product() {
		super();
	}
	public Product(int id, @NotBlank String name, int qty, Double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}

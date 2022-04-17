package com.ty.hibernate_mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private int id;
	private String category;
	private String productName;
	private double productPrice;
	private double productRating;
	private int quantity;

//	public Item(int id, String category, String productName, double productPrice, double productRating, int quantity) {
//		super();
//		this.id = id;
//		this.category = category;
//		this.productName = productName;
//		this.productPrice = productPrice;
//		this.productRating = productRating;
//		this.quantity = quantity;
//	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getProductRating() {
		return productRating;
	}

	public void setProductRating(double productRating) {
		this.productRating = productRating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}

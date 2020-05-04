package rar.business;

import java.io.Serializable;

public class LineItem implements Serializable {

	private static final long serialVersionUID = 1L;
	private String prodName;
	private String category;
	private int quantity;
	private double price;
	
	public LineItem() {}
	
	public LineItem(String prodName, String category, int quantity, double price) {
		this.prodName = prodName;
		this.category = category;
		this.quantity = quantity;
		this.price = price;
	}
	
	public boolean equals(LineItem item) {
		if (item.getCategory().equals(this.category) &&
				item.getProdName().equals(this.prodName) &&
				item.getPrice() == this.price) {
			return true;
		}
		else {
			return false;
		}
	}

	public String getProdName() {
		return prodName;
	}
	
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
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
	
	

}

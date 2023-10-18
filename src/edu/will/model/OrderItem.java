package edu.will.model;

public class OrderItem {
	private int quantity;
	private double price;
	private Product product;
	private Client client;
	
	public OrderItem(int quantity, double price, Product product, Client client) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
		this.client = client;
	}
	
	public double subTotal() {
		return price * quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return this.getProduct().getName() + 
				" R$" + String.format("%.2f", this.getProduct().getPrice()) +
				" , Quantidade: " + this.getQuantity() +
				", Subtotal: R$" + String.format("%.2f", this.subTotal());
		
		
	}
}

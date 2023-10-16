package edu.will.model;

import java.util.ArrayList;

public class Order {
	private OrderStatus status;
	private ArrayList<OrderItem> orderItem = new ArrayList();
	private Client client;
	public Order(OrderStatus status, Client client) {
		this.status = status;
		this.client = client;
//		this.addItem(item);
	}
	
	public void addItem(OrderItem item) {
		this.orderItem.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.orderItem.remove(item);
	}
	
	public double total() {
		double total = 0;
		
		for (OrderItem oi:orderItem) {
			total += oi.subTotal();
		}
		
		return total;
	}
	
	public void printOrder() {
		System.out.println("Status: " + this.status +
				"\nClient name: " + this.client.getName() +
				"\nClient email: " + this.client.getEmail());
		
		
	}
}

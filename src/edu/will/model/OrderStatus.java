package edu.will.model;

public enum OrderStatus {
	PENDING_PAYMENT(0),
	PROCESSING(1),
	SHIPPED(2),
	DELIVERED(3);
	
	private int n;
	private OrderStatus(int n) {
		this.n = n;
	};
}

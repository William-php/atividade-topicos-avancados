package starter;

import edu.will.model.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product1 = new Product("Camisa do São Paulo FC", 299.99);
		Product product2 = new Product("Camisa do Santos FC", 199.15);
		Client client1 = new Client("William dos Santos Ferreira", "will.santos97@hotmail.com");
		
		OrderItem orderItem1 = new OrderItem(5, product1.getPrice(), product1, client1);
		OrderItem orderItem2 = new OrderItem(6, product2.getPrice(), product2, client1);
		
		Order order1 = new Order(OrderStatus.PROCESSING, client1);
		
		order1.addItem(orderItem1);
		order1.addItem(orderItem2);
		order1.printOrder();
	}
	

}

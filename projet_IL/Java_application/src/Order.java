package fr.coffeemocha.modele;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int OrderId;
	private List<OrderItem> OrderItems;
	private OrderStatus status;
	
	public Order(int OrderId) {
		this.OrderId=OrderId;
		this.OrderItems=new ArrayList<>();
		this.status= OrderStatus.EN_ATTENTE;
	}
	
	public void addOrderItem(OrderItem item) {
		OrderItems.add(item);
	}
	
	public void removeOrderItem(OrderItem item) {
		OrderItems.remove(item);
	}
	
	public double calculateTotalPrice() {
	    double totalPrice = 0.0; // 1. Initialisation du prix total à 0.0
	    for (OrderItem item : OrderItems) { // 2. Boucle à travers chaque article de la commande
	        totalPrice += item.getPrice(); // 3. Ajoute le prix de l'article au prix total
	    }
	    return totalPrice; // 4. Retourne le prix total de la commande
	}
	
	public int getOrderId() {
        return OrderId; 
    }

    public List<OrderItem> getOrderItems() {
        return OrderItems; 
    }

    public OrderStatus getStatus() {
        return status; 
    }

    public void setStatus(OrderStatus status) {
        this.status = status; // Met à jour le statut de la commande
    }
	
}

package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStok() {

		return price * quantity;
	}

	public void addQuantity(int add) {

		this.quantity += add;
	}

	public void addRemove(int remove) {

		this.quantity -= remove;
	}

	public String toString() {
		
		return "Name: " + name +
			   ", Unity Value: " + String.format("U$ %.2f", price) +
			   ", Total in Stok: " + quantity +
			   ", Total Value in Stok: " + String.format("U$ %.2f", totalValueInStok());
			   
				
	}
	
}

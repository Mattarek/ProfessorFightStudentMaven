package warehouse;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Warehouse<Electronics> electronicsWarehouse = new Warehouse<>();
		electronicsWarehouse.addProduct(new Electronics("Laptop", BigDecimal.valueOf(1200)));
		electronicsWarehouse.addProduct(new Electronics("Smartphone", BigDecimal.valueOf(1600)));
		electronicsWarehouse.displayProducts();
		System.out.println("Total Electronics: " + electronicsWarehouse.getTotalProducts());

		//Food
		Warehouse<Food> foodWarehouse = new Warehouse<>();
		foodWarehouse.addProduct(new Food("Bread", BigDecimal.valueOf(3.5)));
		foodWarehouse.addProduct(new Food("Milk", BigDecimal.valueOf(4.2)));
		foodWarehouse.displayProducts();
		System.out.println("Total Food: " + foodWarehouse.getTotalProducts());
	}
}

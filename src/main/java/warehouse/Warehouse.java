package warehouse;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T extends Product> {
	private List<T> products = new ArrayList<>();

	public void addProduct(T product) {
		products.add(product);
	}

	public void removeProduct(T product) {
		products.remove(product);
	}

	public void displayProducts() {
		for (T product : products) {
			System.out.println(product);
		}
	}

	public int getTotalProducts() {
		return products.size();
	}
}

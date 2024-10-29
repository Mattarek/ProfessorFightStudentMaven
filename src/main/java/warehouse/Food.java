package warehouse;

import java.math.BigDecimal;

public class Food implements Product {
	public String name;
	private BigDecimal price;

	public Food(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public BigDecimal getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
}

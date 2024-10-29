package warehouse;

import warehouse.Product;

import java.math.BigDecimal;

public class Electronics implements Product {
	private String name;
	private BigDecimal price;

	public Electronics(String name, BigDecimal price) {
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
		return "Electronics [name=" + name + ", price=" + price + "]";
	}
}

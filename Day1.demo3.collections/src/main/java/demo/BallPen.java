package demo;

import org.springframework.stereotype.Component;

@Component
public class BallPen implements Product{
	private String name;
	private double price;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BallPen [name=" + name + ", price=" + price + "]";
	}
	
}

package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Inventory {
	 @Autowired
	private List<Product> prod = new ArrayList<Product>();
	
	public void print() {
		System.out.println("-------Product List -----------");
		prod.forEach(prod->System.out.println(prod));
	}
}

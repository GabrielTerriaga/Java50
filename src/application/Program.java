package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		Function<Product, String> func = p -> p.getName().toUpperCase();
		//function com map + static method
		List<String> namesUp = list.stream().map(func).collect(Collectors.toList());
		
		namesUp.forEach(System.out::println);
	}

}

package application;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Demo {

	public static void main(String[] args) {
		
		Set <Product> set = new HashSet<>();
		
		set.add(new Product("Tv", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		if (set.contains(prod)) {
			System.out.println("O objeto " + prod + " já foi instanciado");
		}else {
			System.out.println("O objeto " + prod + " ainda não  foi instanciado");
		}

	}

}

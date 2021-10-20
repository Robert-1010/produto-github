package application;
//ctrl + shift + f = indentar automatico
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product();// tabem podemos instânciar o objeto através do construtor padrão

		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);//seve para proteger o xesenvolvimento do programa
		
		product.setName("Computer");
		System.out.println("updated data: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("updated data: " + product.getPrice());

		
		System.out.println();
		System.out.println("updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of products to be added in stock: ");// adiciona produtos
	    int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("updated data: " + product);
		
		System.out.println("Enter the number of products to removed from stock: ");		// Remove produtos
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("updated data: " + product);

		System.out.println();

		sc.close();
	}

}

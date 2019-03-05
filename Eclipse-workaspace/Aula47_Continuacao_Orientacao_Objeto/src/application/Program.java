package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		var scanner = new Scanner(System.in);

		System.out.println("Enter product data");

		System.out.print("Name: ");
		var name = scanner.nextLine();

		System.out.print("Price: ");
		var price = scanner.nextDouble();

		System.out.print("Quantity in stock: ");
		var quantity = scanner.nextInt();

		var product = new Product(name, price, quantity);

		product.setName("Computador");
		
		System.out.println(product);

		System.out.println("Enter the number of products to be added in stock: ");
		product.addProducts(scanner.nextInt());

		System.out.println(product);

		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(scanner.nextInt());

		System.out.println(product);

		scanner.close();
	}

}

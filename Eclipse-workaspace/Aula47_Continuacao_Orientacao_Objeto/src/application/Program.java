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

		var product = new Product();

		System.out.print("Name: ");
		product.name = scanner.nextLine();

		System.out.print("Price: ");
		product.price = scanner.nextDouble();

		System.out.print("Quantity in stock: ");
		product.quantity = scanner.nextInt();

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

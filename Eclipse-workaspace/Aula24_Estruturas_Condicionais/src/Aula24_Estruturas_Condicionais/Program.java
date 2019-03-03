package Aula24_Estruturas_Condicionais;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		var x = 1;
		while (x != 0) {
			System.out.println("Enter an integer number: ");
			x = scanner.nextInt();

			if (x % 2 == 0) {
				System.out.println("Even!");
			} else {
				System.out.println("Odd!");
			}
		}

	}

}

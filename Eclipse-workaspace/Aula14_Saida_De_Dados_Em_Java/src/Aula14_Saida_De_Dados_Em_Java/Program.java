package Aula14_Saida_De_Dados_Em_Java;

import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender ='F';
		int age = 32;
		double balance = 10.35784;
		String name = "Maria";

		System.out.print("Good afternoon!");
		System.out.println("Good morning!");
		System.out.println("Good night!");
		System.out.println("---------------------------------");
		
		
		System.out.printf("%.2f%n", balance);
		System.out.printf("%.3f%n", balance);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f%n", balance);

		System.out.println("---------------------------------");
		System.out.printf("%s is %d years old, gender %c, and balance = %.2f bitcoins", name, age, gender, balance);
		
		
	}

}

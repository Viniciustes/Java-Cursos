package Aula17_Entrada_De_Dados_Em_Java;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String sentence = scanner.nextLine();
		
		String x,y,z;
		x= scanner.next();
		y= scanner.next();
		z= scanner.next();
		
		System.out.println(sentence);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		scanner.close();
	}

}

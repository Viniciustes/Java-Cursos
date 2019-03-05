package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int[][] matriz = new int[n][n];

		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				matriz[linhas][colunas] = scanner.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}

		int count = 0;
		System.out.println();

		for (int linhas = 0; linhas < matriz.length; linhas++) {
			for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
				if (matriz[linhas][colunas] < 0) {
					count++;
				}
			}
		}

		System.out.println("Negative numbers = " + count);

		scanner.close();
	}

}

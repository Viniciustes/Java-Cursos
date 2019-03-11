package application;

import chess.ChessPiece;

public class UI {

	public static void printBoard(ChessPiece[][] pieces) {

		for (int i = 0; i < pieces.length; i++) {

			System.out.print((pieces.length - i) + " ");

			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}

			System.out.println();
		}

		printAlphabetLetter(pieces.length);
	}

	private static void printAlphabetLetter(int numberLetterPrint) {

		var aux = 0;
		for (char letter = 'a'; letter <= 'z'; letter++) {

			if (aux == 0) {
				System.out.print("  " + letter);
			} else if (aux < numberLetterPrint) {
				System.out.print(" " + letter);
			} else {
				return;
			}

			aux++;
		}
	}

	private static void printPiece(ChessPiece piece) {

		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}

		System.out.print(" ");
	}
}

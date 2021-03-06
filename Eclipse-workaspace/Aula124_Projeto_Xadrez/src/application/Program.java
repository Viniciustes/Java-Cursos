package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		var scanner = new Scanner(System.in);
		var chessMatch = new ChessMatch();

		while (true) {
			try {
				UI.clearScreen();
				//UI.printBoard(chessMatch.getPieces());
				UI.printMatch(chessMatch);

				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(scanner);
				
				boolean [][] possibleMoves = chessMatch.possibleMoves(source);
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces(), possibleMoves);
				

				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(scanner);

				ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
			} catch (ChessException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			} catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				scanner.nextLine();
			}
		}
	}
}

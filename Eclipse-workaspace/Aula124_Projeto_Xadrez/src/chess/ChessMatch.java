package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {

		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {

		var chessPiece = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 0; i < board.getRows(); i++) {

			for (int j = 0; j < board.getColumns(); j++) {

				chessPiece[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return chessPiece;
	}

	private void placeNewPiece(ChessPiece piece, char column, int row) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}

	private void initialSetup() {
		placeNewPiece(new Rook(board, Color.WHITE), 'b', 6);
		placeNewPiece(new Rook(board, Color.BLACK), 'c', 4);
	}
}

package domain;

import domain.pieces.PieceCreator;
import domain.pieces.Team;

public class Board {
	private Player white;
	private Player black;

	public Board() {
		initBoard();
	}

	private void initBoard() {
		white = new Player(Team.WHITE);
		black = new Player(Team.BLACK);
		white.setPieces(PieceCreator.createPieces(white));
		black.setPieces(PieceCreator.createPieces(black));
	}
}

package domain.pieces;

import domain.Position;

public class Rook extends Piece {
	private static final char REPRESENTATION = 'p';

	public Rook(Position position) {
		super(position, REPRESENTATION);
	}
}

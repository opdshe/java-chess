package domain.pieces;

import domain.Position;

public class Pawn extends Piece {
	private static final char REPRESENTATION = 'r';

	public Pawn(Position position) {
		super(position, REPRESENTATION);
	}
}

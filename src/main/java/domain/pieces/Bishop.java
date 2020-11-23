package domain.pieces;

import domain.Position;

public class Bishop extends Piece {
	private static final char REPRESENTATION = 'b';

	public Bishop(Position position) {
		super(position, REPRESENTATION);
	}
}

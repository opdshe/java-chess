package domain.pieces;

import domain.Position;

public class King extends Piece {
	private static final char REPRESENTATION = 'k';

	public King(Position position) {
		super(position, REPRESENTATION);
	}
}

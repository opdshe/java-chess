package domain.pieces;

import domain.Position;

public class Knight extends Piece {
	private static final char REPRESENTATION = 'n';

	public Knight(Position position) {
		super(position, REPRESENTATION);
	}
}

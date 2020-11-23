package domain.pieces;

import domain.Position;

public class Queen extends Piece {
	private static final char REPRESENTATION = 'q';

	public Queen(Position position) {
		super(position, REPRESENTATION);
	}
}

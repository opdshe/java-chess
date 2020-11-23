package domain.pieces;

import domain.Position;

public class Piece {
	private Position position;
	private char representation;

	public Piece(Position position, char representation) {
		this.position = position;
		this.representation = representation;
	}
}

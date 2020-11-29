package chess.domain.piece;

public class Piece {
    private char representation;
    private Location location;

    public Piece(char representation, Location location) {
        this.representation = representation;
        this.location = location;
    }
}

package chess.domain.piece;

public class Queen extends Piece {
    private static final char representation = 'q';

    public Queen(Location location) {
        super(representation, location);
    }
}

package chess.domain.piece;

public class Bishop extends Piece {
    private static final char representation = 'b';

    public Bishop(Location location) {
        super(representation, location);
    }
}

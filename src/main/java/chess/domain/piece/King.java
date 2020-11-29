package chess.domain.piece;

public class King extends Piece {
    private static final char representation = 'k';

    public King(Location location) {
        super(representation, location);
    }
}

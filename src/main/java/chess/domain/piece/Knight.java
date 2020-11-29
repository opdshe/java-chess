package chess.domain.piece;

public class Knight extends Piece {
    private static final char representation = 'n';

    public Knight(Location location) {
        super(representation, location);
    }
}

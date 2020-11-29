package chess.domain.piece;

public class Rook extends Piece {
    private static final char representation = 'r';

    public Rook(Location location) {
        super(representation, location);
    }
}

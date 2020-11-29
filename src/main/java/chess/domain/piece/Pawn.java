package chess.domain.piece;

public class Pawn extends Piece {
    private static final char representation = 'p';

    public Pawn(Location location) {
        super(representation, location);
    }
}

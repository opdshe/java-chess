package chess.domain.piece;

import chess.domain.player.Team;

import java.util.ArrayList;
import java.util.List;

public class PiecesCreator {
    private static final int WHITE_PAWN_ROW = 6;
    private static final int BLACK_PAWN_ROW = 1;
    private static final int WHITE_NOBLE_ROW = 7;
    private static final int BLACK_NOBLE_ROW = 0;
    private static final int MAX_POSITION_OF_CHESS_BOARD = 8;

    private PiecesCreator() {
    }


    public static Pieces createPieces(Team team) {
        List<Piece> pieces = new ArrayList<>();
        addPawns(pieces, team);
        addNobles(pieces, team);
        return new Pieces(pieces);
    }

    private static void addNobles(List<Piece> pieces, Team team) {
        int nobleRow = getNobleRow(team);
        pieces.add(new Rook(new Location(nobleRow, 0)));
        pieces.add(new Knight(new Location(nobleRow, 1)));
        pieces.add(new Bishop(new Location(nobleRow, 2)));
        pieces.add(new Queen(new Location(nobleRow, 3)));
        pieces.add(new King(new Location(nobleRow, 4)));
        pieces.add(new Bishop(new Location(nobleRow, 5)));
        pieces.add(new Knight(new Location(nobleRow, 6)));
        pieces.add(new Rook(new Location(nobleRow, 7)));
    }

    private static void addPawns(List<Piece> pieces, Team team) {
        int pawnRow = getPawnRow(team);
        for (int column = 0; column < MAX_POSITION_OF_CHESS_BOARD; column++) {
            pieces.add(new Pawn(new Location(pawnRow, column)));
        }
    }

    private static int getNobleRow(Team team) {
        if (isWhite(team)) {
            return WHITE_NOBLE_ROW;
        }
        return BLACK_NOBLE_ROW;
    }

    private static int getPawnRow(Team team) {
        if (isWhite(team)) {
            return WHITE_PAWN_ROW;
        }
        return BLACK_PAWN_ROW;
    }

    private static boolean isWhite(Team team) {
        return team == Team.WHITE;
    }
}

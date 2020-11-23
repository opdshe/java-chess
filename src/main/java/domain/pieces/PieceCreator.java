package domain.pieces;

import domain.Player;
import domain.Position;

import java.util.ArrayList;
import java.util.List;

public class PieceCreator {
	private static final int MIN_ROW_OF_BOARD = 1;
	private static final int MAX_ROW_OF_BOARD = 8;
	private static final int WHITE_PAWNS_ROW = 2;
	private static final int WHITE_OTHERS_ROW = 1;
	private static final int BLACK_PAWNS_ROW = 7;
	private static final int BLACK_OTHERS_ROW = 8;

	private PieceCreator() {
	}

	public static List<Piece> createPieces(Player player) {
		List<Piece> pieces = new ArrayList<>();
		if (player.getTeam() == Team.WHITE) {
			putPawns(pieces, WHITE_PAWNS_ROW);
			putOthers(pieces, WHITE_OTHERS_ROW);
		} else {
			putPawns(pieces, BLACK_PAWNS_ROW);
			putOthers(pieces, BLACK_OTHERS_ROW);
		}
		return pieces;
	}

	private static void putOthers(List<Piece> pieces, int row) {
		pieces.add(new Rook(new Position(row, 1)));
		pieces.add(new Knight(new Position(row, 2)));
		pieces.add(new Bishop(new Position(row, 3)));
		pieces.add(new Queen(new Position(row, 4)));
		pieces.add(new King(new Position(row, 5)));
		pieces.add(new Bishop(new Position(row, 6)));
		pieces.add(new Knight(new Position(row, 7)));
		pieces.add(new Rook(new Position(row, 8)));
	}

	private static void putPawns(List<Piece> pieces, int row) {
		for (int column = MIN_ROW_OF_BOARD; column < MAX_ROW_OF_BOARD; column++) {
			pieces.add(new Pawn(new Position(row, column)));
		}
	}
}

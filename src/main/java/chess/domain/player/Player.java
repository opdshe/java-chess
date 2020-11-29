package chess.domain.player;

import chess.domain.piece.Pieces;
import chess.domain.piece.PiecesCreator;

public class Player {
    private Team team;
    private Pieces pieces;

    public Player(Team team) {
        this.team = team;
        this.pieces = PiecesCreator.createPieces(team);
    }
}

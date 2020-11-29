package chess.domain;

import chess.domain.player.Player;
import chess.domain.player.Team;

public class ChessBoard {
    private Player white;
    private Player black;

    public ChessBoard() {
        white = new Player(Team.WHITE);
        black = new Player(Team.WHITE);
    }
}

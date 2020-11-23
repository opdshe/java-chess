package domain;

import domain.pieces.Piece;
import domain.pieces.Team;

import java.util.List;

public class Player {
	private Team team;
	private List<Piece> pieces;

	public Player(Team team) {
		this.team = team;
	}

	public void setPieces(List<Piece> pieces) {
		this.pieces = pieces;
	}

	public Team getTeam() {
		return team;
	}
}

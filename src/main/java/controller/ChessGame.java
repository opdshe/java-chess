package controller;

import domain.Board;
import view.InputView;
import view.OutputView;

public class ChessGame {
	public static final String OPERATION_START = "start";
	public static final String OPERATION_END = "end";
	public static final String OPERATION_MOVE = "move";

	public static void play() {
		Board board = new Board();
		OutputView.printGuideMessage();
		InputView.inputOperation();
	}
}

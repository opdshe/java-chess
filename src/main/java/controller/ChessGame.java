package controller;

import view.InputView;
import view.OutputView;

import java.util.Arrays;

public class ChessGame {
	public static final String OPERATION_START = "start";
	public static final String OPERATION_END = "end";
	public static final String OPERATION_MOVE = "move";

	public static void play() {
		OutputView.printGuideMessage();
		String[] splitOperation = InputView.inputOperation();
		System.out.println(Arrays.toString(splitOperation));
	}
}

package utils;

import controller.ChessGame;
import exceptions.NotSupportedOperationException;

public class Validator {
	private Validator() {
	}

	public static void validateOperation(String[] splitOperation) {
		if (!splitOperation[0].equals(ChessGame.OPERATION_START) && !splitOperation[0].equals(ChessGame.OPERATION_END) &&
				!splitOperation[0].equals(ChessGame.OPERATION_MOVE)) {
			throw new NotSupportedOperationException();
		}
	}
}

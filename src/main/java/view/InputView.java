package view;

import exceptions.NotSupportedOperationException;
import utils.Validator;

import java.util.Scanner;

public class InputView {
	private static final Scanner SCANNER = new Scanner(System.in);

	public static String[] inputOperation() {
		String operation = SCANNER.nextLine();
		String[] splitOperation = operation.split(" ");
		try {
			Validator.validateOperation(splitOperation);
		} catch (NotSupportedOperationException e) {
			OutputView.printMessage(e.getMessage());
			splitOperation = inputOperation();
		}
		return splitOperation;
	}
}

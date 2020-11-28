package chess.view;

import java.util.Scanner;

public class InputView {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String INPUT_COMMAND = "명령어를 입력하세요. ";

    private InputView() {
    }

    public static String getCommand() {
        OutputView.printMessageAndNewLine(INPUT_COMMAND);
        return SCANNER.nextLine();
    }
}

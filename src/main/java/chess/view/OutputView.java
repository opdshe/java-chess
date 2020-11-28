package chess.view;

public class OutputView {
    private static final String GREETING_MESSAGE = "체스 게임을 시작합니다.\n게임 시작 : start\n게임 종료 : end\n" +
            "게임 이동 : move source위치 - target위치 ex)move b2 b3";

    private OutputView() {
    }

    public static void printGreetingMessage() {
        printMessageAndNewLine(GREETING_MESSAGE);
    }

    public static void printMessageAndNewLine(String message) {
        System.out.println(message);
    }
}

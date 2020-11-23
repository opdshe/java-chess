package view;

public class OutputView {
	private static String GUIDE_MESSAGE = "체스 게임을 시작합니다.\n게임 시작 : start\n게임 종료 : end\n" +
			"게임 이동 :move source위치 target위치 - 예. move b2 b3";

	public static void printGuideMessage() {
		printMessage(GUIDE_MESSAGE);
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
}

package exceptions;

public class NotSupportedOperationException extends RuntimeException {
	private static final String MESSAGE = "지원하지 않는 동작입니다. 가이드 메세지를 확인한 후 다시 입력해 주세요. ";

	public NotSupportedOperationException() {
		super(MESSAGE);
	}
}

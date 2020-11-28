package chess.exceptions;

public class NotSupportedCommandException extends RuntimeException {
    private static final String message = "지원하지 않는 커맨드입니다. ";

    public NotSupportedCommandException() {
        super(message);
    }
}

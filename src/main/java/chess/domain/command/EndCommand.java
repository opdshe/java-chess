package chess.domain.command;

public class EndCommand implements Command {
    private static final String COMMAND = "end";

    public static boolean isEnd(String operation) {
        return COMMAND.equals(operation.toLowerCase());
    }

    @Override
    public void execute() {
    }
}

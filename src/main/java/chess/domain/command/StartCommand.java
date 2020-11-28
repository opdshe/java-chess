package chess.domain.command;

public class StartCommand implements Command {
    private static final String COMMAND = "start";

    public StartCommand() {
    }

    public static boolean isStart(String operation) {
        return COMMAND.equals(operation.toLowerCase());
    }

    @Override
    public void execute() {
    }
}

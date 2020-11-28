package chess.validators;

import chess.exceptions.NotSupportedCommandException;

import java.util.HashSet;
import java.util.Set;

public class CommandValidator {
    private static final Set<String> commands = new HashSet<>();

    static {
        commands.add("start");
        commands.add("end");
        commands.add("move");
        commands.add("status");
    }

    public static void validateCommand(String rawCommand) {
        String firstIndexOfCommand = getFirstIndex(rawCommand);
        String lowercaseFirstIndex = firstIndexOfCommand.toLowerCase();
        if (!commands.contains(lowercaseFirstIndex)) {
            throw new NotSupportedCommandException();
        }
    }

    private static String getFirstIndex(String rawCommand) {
        return rawCommand.split(" ")[0];
    }
}

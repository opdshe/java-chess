package utils;

public class CommandSplitter {
    private static final int SOURCE_INDEX = 1;
    private static final int DESTINATION_INDEX = 2;

    private CommandSplitter() {
    }

    public static String[] getSourceAndDest(String rawCommand) {
        String[] splitCommand = rawCommand.split(" ");
        return new String[]{splitCommand[SOURCE_INDEX], splitCommand[DESTINATION_INDEX]};
    }
}

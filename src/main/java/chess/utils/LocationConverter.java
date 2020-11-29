package chess.utils;

import chess.domain.piece.Location;

public class LocationConverter {
    private static final int INT_VALUE_OF_LOWER_A = 97;
    private static final int SIZE_OF_CHESS_BOARD = 8;
    private static final int FIRST_INDEX = 0;
    private static final int SECOND_INDEX = 1;

    private LocationConverter() {
    }

    public static Location convertLocation(String rawLocation) {
        char[] splitLocation = rawLocation.toCharArray();
        return new Location(convertRow(splitLocation[SECOND_INDEX]), convertColumn(splitLocation[FIRST_INDEX]));
    }

    private static int convertColumn(char rawColumn) {
        char lowerRawRow = Character.toLowerCase(rawColumn);
        return (int) (lowerRawRow) - INT_VALUE_OF_LOWER_A;
    }

    private static int convertRow(char rawRow) {
        return SIZE_OF_CHESS_BOARD - Character.getNumericValue(rawRow);
    }
}

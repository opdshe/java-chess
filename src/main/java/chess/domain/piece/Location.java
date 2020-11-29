package chess.domain.piece;

import java.util.Objects;

public class Location {
    private int y;
    private int x;

    public Location(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return y == location.y &&
                x == location.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(y, x);
    }
}

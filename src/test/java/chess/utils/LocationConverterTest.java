package chess.utils;

import chess.domain.piece.Location;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LocationConverterTest {
    @Test
    public void 위치변환기_동작_테스트() {
        //given
        String rawLocation = "a2";

        //when
        Location convertedLocation = LocationConverter.convertLocation(rawLocation);

        //then
        assertThat(convertedLocation).isEqualTo(new Location(6, 0));
    }
}
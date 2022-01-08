package bowling.domain;

import java.util.Objects;

public class Pins {

    public static final int MIN_RANGE = 0;
    public static final int MAX_RANGE = 10;

    private final int pinCount;

    private Pins(int pinCount) {
        this.pinCount = pinCount;
    }

    public static Pins create(int pinCount) {
        validateRange(pinCount);
        return new Pins(pinCount);
    }

    private static void validateRange(int pinCount) {
        if (MIN_RANGE > pinCount || MAX_RANGE < pinCount) {
            throw new IllegalArgumentException(String.format("쓰러질 수 있는 핀의 개수는 %d개 이상 %d개 이하 입니다. 현재 쓰러트린 개수는 %d개 입니다.", MIN_RANGE, MAX_RANGE, pinCount));
        }
    }

    public boolean isStrike() {
        return pinCount == MAX_RANGE;
    }

    public boolean isSpare(Pins secondPins) {
        return pinCount + secondPins.pinCount == MAX_RANGE;
    }

    public boolean isMiss(Pins secondPins) {
        return pinCount + secondPins.pinCount < MAX_RANGE;
    }

    public boolean isGutter() {
        return pinCount == MIN_RANGE;
    }

    public int totalPinsCount(Pins secondPins) {
        return pinCount + secondPins.pinCount;
    }

    public int getPinCount() {
        return pinCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pins pins = (Pins) o;
        return pinCount == pins.pinCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pinCount);
    }

    @Override
    public String toString() {
        return "Pins{" +
                "pinCount=" + pinCount +
                '}';
    }
}

package step2.domain;

public class Pin {

    private int remainingPin = 10;

    public void fall(int countOfHit) {
        if ((remainingPin - countOfHit) < 0) {
            throw new IllegalStateException();
        }

        this.remainingPin -= countOfHit;
    }

    public int getRemainingPin() {
        return remainingPin;
    }
}

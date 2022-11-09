package step2;

import step2.domain.Player;
import step2.view.InputView;

public class BowlingApplication {

    public static void main(String[] args) {
        String name = InputView.inputPlayerName();
        Player player = new Player(name);
    }
}

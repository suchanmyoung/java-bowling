package step2.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    public static String inputPlayerName() {
        OutputView.printPlayerNameNotification();

        return scanner.nextLine();
    }
}

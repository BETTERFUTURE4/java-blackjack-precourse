package view;

import java.util.Scanner;

public class InputView {
    private static final String WRONG_ANSWER = "y";
    private static final String YES = "y";
    private static final String NO = "n";

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String participantName() {
        return scanner.nextLine();
    }

    public String bettingMoney() {
        return scanner.nextLine();
    }

    public String willDraw() {
        String answer = scanner.nextLine();

        if (!answer.equals(YES) && !answer.equals(NO)) {
            throw new IllegalArgumentException(WRONG_ANSWER);
        }
        return answer;
    }
}

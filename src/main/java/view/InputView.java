package view;

import java.util.Scanner;

public class InputView {
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
}

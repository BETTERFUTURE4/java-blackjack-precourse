package view;

import java.util.Scanner;

public class InputView {
	public static final String NAMES_INPUT = "게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)";
	private static final String USER_MONEY_INPUT = "%s의 배팅 금액은?\n";
	public static final Scanner scanner = new Scanner(System.in);

	public static String inputNames() {
		System.out.println(NAMES_INPUT);
		return scanner.nextLine();
	}

	public static String inputUserMoney(String name) {
		System.out.printf(USER_MONEY_INPUT, name);
		return scanner.nextLine();
	}
}
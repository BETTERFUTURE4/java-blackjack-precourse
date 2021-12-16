package view;

import java.util.ArrayList;

import domain.User;
import domain.repository.Repository;

public class OutputView {
	public static final String OUTPUT_EX = "문자 : %s";

	public static void printArraylist(ArrayList<String> arrayList) {
		arrayList.forEach(System.out::println);
	}

	public static void printF(ArrayList<String> arrayList) {
		arrayList.forEach(array -> System.out.printf(OUTPUT_EX, array));
		System.out.printf(OUTPUT_EX, arrayList);
	}

	public static void printDealerCards() {
		System.out.println(Repository.DEALER.getCardStatus());
	}

	public static void printUsersCards() {
		Repository.users.get().forEach(user -> System.out.println(user.getCardStatus()));
	}

	public static void printUserCards(User user) {
		System.out.println(user.getCardStatus());
	}

	public static void printBreak() {
		System.out.println();
	}

	public static void printError(String message) {
		System.out.println(message);
		System.out.println();
	}
}

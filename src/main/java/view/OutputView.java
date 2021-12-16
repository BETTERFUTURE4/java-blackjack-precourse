package view;

import java.util.ArrayList;

public class OutputView {
	public static final String OUTPUT_EX = "문자 : %s";

	public static void printArraylist(ArrayList<String> arrayList) {
		arrayList.forEach(System.out::println);
	}

	public static void printF(ArrayList<String> arrayList) {
		arrayList.forEach(array -> System.out.printf(OUTPUT_EX, array));
		System.out.printf(OUTPUT_EX, arrayList.toString());
	}

	public static void printBreak() {
		System.out.println();
	}

	public static void printError(String message) {
		System.out.println(message);
		System.out.println();
	}
}

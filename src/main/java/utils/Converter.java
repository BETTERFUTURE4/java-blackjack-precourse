package utils;

import java.util.ArrayList;
import java.util.Arrays;

import domain.User;

public class Converter {
	public static int getInt(String moneyString) {
		return Integer.parseInt(moneyString);
	}
	public static String getString(int num) {
		return Integer.toString(num);
	}

	public static ArrayList<String> getNameSplit(String usersString) {
		return new ArrayList<>(Arrays.asList(usersString.split(Constants.SEPARATOR)));
	}

	public static ArrayList<User> getUsers(String usersString) {
		ArrayList<User> users = new ArrayList<>();
		for (String user : getNameSplit(usersString)) {
			users.add(new User(user));
		}
		return users;
	}
}

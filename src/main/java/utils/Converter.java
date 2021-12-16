package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import domain.User;

public class Converter {
	public static int getInt(String moneyString) {
		return Integer.parseInt(moneyString);
	}

	public static List<String> getNameSplit(String usersString) {
		return Arrays.asList(usersString.split(Constants.SEPARATOR));
	}

	public static List<User> getUsers(String usersString) {
		ArrayList<User> users = new ArrayList<>();
		for (String user : getNameSplit(usersString)) {
			users.add(new User(user));
		}
		return users;
	}
}

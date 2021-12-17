package utils;

import java.util.ArrayList;
import java.util.Arrays;

import domain.Player;

public class Converter {
	public static int getInt(String moneyString) {
		return Integer.parseInt(moneyString);
	}

	public static ArrayList<String> getNameSplit(String usersString) {
		return new ArrayList<>(Arrays.asList(usersString.split(Constants.SEPARATOR)));
	}

	public static ArrayList<Player> getUsers(String usersString) {
		ArrayList<Player> players = new ArrayList<>();
		for (String user : getNameSplit(usersString)) {
			players.add(new Player(user));
		}
		return players;
	}
}

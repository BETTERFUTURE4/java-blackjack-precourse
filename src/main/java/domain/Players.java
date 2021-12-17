package domain;

import java.util.ArrayList;

import utils.Converter;
import utils.validator.NamesValidator;

public class Players {
	private final ArrayList<Player> players;

	public Players(String users) {
		new NamesValidator(users);
		this.players = Converter.getUsers(users);
	}

	public ArrayList<Player> get() {
		return players;
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		players.forEach(user -> stringBuilder.append(", ").append(user.name));
		return stringBuilder.toString();
	}
}

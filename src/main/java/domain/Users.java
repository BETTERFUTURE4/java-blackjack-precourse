package domain;

import java.util.ArrayList;

import utils.Converter;
import utils.validator.NamesValidator;

public class Users {
	private final ArrayList<User> users;

	public Users(ArrayList<User> users) {
		this.users = users;
	}

	public Users(String users) {
		new NamesValidator(users);
		this.users = Converter.getUsers(users);
	}

	public ArrayList<User> get() {
		return users;
	}

	public boolean isEmpty() {
		return users.isEmpty();
	}

	@Override
	public String toString() {
		// 프린트 원하는 방식으로 구현
		StringBuilder stringBuilder = new StringBuilder();
		users.forEach(user -> stringBuilder.append(", " + user.name));
		return stringBuilder.toString();
	}
}

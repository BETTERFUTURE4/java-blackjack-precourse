package domain.repository;

import domain.Dealer;
import domain.Players;

public class Repository {
	public static Players players;
	public static final Dealer DEALER = new Dealer();

	// public static Object get() {
	// 	return model;
	// }

	// public static Object find(String name) {
	// 	for (Object obj : models) {
	// 		if (obj.equals(name)) {
	// 			return obj;
	// 		}
	// 	}
	// 	// 결과가 없으면 예외처리
	// 	throw new IllegalArgumentException(Constants.ERROR);
	// }
}

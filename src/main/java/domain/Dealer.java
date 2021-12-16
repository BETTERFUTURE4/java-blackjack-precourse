package domain;

public class Dealer extends User {
	public Dealer() {
		super("딜러");
		this.money = new Money(0);
	}
}

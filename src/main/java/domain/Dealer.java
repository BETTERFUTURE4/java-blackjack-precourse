package domain;

public class Dealer extends User {
	public Dealer() {
		super("딜러");
		this.money = new Money(0);
	}
	public void setWin(User user) {
		this.money = new Money(this.money.get() + user.money.get());
	}

	public void setLose(User user) {
		this.money = new Money(this.money.get() - user.money.get());
	}

	public void setBlackjackLose(User user) {
		this.money = new Money((int)(this.money.get() - user.money.get() * (1.5)));
	}
}

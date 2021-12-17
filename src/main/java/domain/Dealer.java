package domain;

public class Dealer extends Player {
	public Dealer() {
		super("딜러");
		this.money = new Money(0);
	}
	public void setWin(Player player) {
		this.money = new Money(this.money.get() + player.money.get());
	}

	public void setLose(Player player) {
		this.money = new Money(this.money.get() - player.money.get());
	}

	public void setBlackjackLose(Player player) {
		this.money = new Money((int)(this.money.get() - player.money.get() * (1.5)));
	}
}

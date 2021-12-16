package domain.repository;

public enum CardPattern {
	DIAMOND("다이아몬드"),
	CLOVER("클로버"),
	SPADE("스페이드"),
	HEART("하트");

	private final String Pattern;

	CardPattern(final String Pattern) {
		this.Pattern = Pattern;
	}

	// 추가 기능 구현
	public String getPattern() {
		return Pattern;
	}

	@Override
	public String toString() {
		return Pattern;
	}
}

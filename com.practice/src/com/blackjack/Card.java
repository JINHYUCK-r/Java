package com.blackjack;

public class Card {
	public static final String[] PATTERN = {"다이아몬드","스페이드","클로버","에이스"};
	private String pattern;
	private String denomination;
	
	public Card(String pattern, String denomination) {
		this.pattern=pattern;
		this.denomination=denomination;
	}

	public String getPattern() {
		return pattern;
	}

	public String getDenomination() {
		return denomination;
	}
	@Override
	public String toString() {
		return String.format("pattern : %s , denomination : %s ",pattern, denomination);
	}

}

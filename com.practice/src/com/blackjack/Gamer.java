package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
	private List<Card> cardList = new ArrayList();
	
	
	public void receiveCard(Card c) {
		cardList.add(c);
	}
	public void openCard() {
		for(Card card : cardList) {
			System.out.println(card);
		}
	}
	
	public int getScore() {
		int sum=0;
		for(Card card : cardList) {
			sum += convertNumber(card);
		}
		
		return sum;
	}
	
	public int convertNumber(Card c) {
		switch(c.getDenomination()) {
		case "A" : 
			return 1;
		case "J": case "Q" : case "K":
			return 10;
		default :
			return Integer.parseInt(c.getDenomination());
		}
	}
}

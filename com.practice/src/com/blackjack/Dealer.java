package com.blackjack;

public class Dealer extends Gamer{
	
	private static final int RECEIVE_POINT=16;
	
	public void moreCard(Card c) {
		if(getScore()<=RECEIVE_POINT) {
			receiveCard(c);
		}
	}
	

}

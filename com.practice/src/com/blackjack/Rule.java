package com.blackjack;

public class Rule {
	public static final int WIN_SCORE=21;
	
	public static void whoisWin(Gamer gamer, Dealer dealer) {
		int gamerScore = gamer.getScore();
		int dealerScore = dealer.getScore();
		
		if(gamerScore==dealerScore || gamerScore>WIN_SCORE && dealerScore>WIN_SCORE) {
		System.out.println("무승부");
	}else if(gamerScore>WIN_SCORE || dealerScore>gamerScore ) {
		System.out.println("딜러 승");
	}else if(dealerScore>WIN_SCORE || gamerScore>dealerScore) {
		System.out.println("게이머 승");
	}
}
}
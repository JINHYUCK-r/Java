package com.blackjack;

import java.util.Scanner;

public class Game {
	private static final int FIRST_DRAW = 2;

	public static void main(String[] args) {
		CardDeck cd = new CardDeck();
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < FIRST_DRAW; i++) {
			gamer.receiveCard(cd.draw());
			dealer.receiveCard(cd.draw());
		}
		dealer.moreCard(cd.draw());

		while (true) {
			gamer.openCard();
			System.out.println("카드를 더 받으시겠습니까?(Y/N) : ");
			String answer = scan.next();

			if (!(answer.equals("Y") || answer.equals("y"))) {
				break;
			}
			gamer.receiveCard(cd.draw());
		}
		System.out.println("------------------");
		System.out.println("딜러카드 확인");
		dealer.openCard();
		Rule.whoisWin(gamer, dealer);
	}

}

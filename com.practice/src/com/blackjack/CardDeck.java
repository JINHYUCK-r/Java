package com.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> cardList = new ArrayList(); 

	CardDeck(){
		init();
	}
	public void init() {
		for(int i=0; i<Card.PATTERN.length; i++) {
			for(int z=0; z<13; z++) {
				String denomination=null;
				switch(z) {
				case 0:
					denomination="A";
					break;
				case 10:
					denomination="J";
					break;
				case 11:
					denomination="Q";
					break;
				case 12:
					denomination="K";
					break;
				default :
					denomination = Integer.toString(z);
					break;
				}
				Card card = new Card(Card.PATTERN[i],denomination);
				cardList.add(card);
			}
		}
	}
	
	public Card draw() {
		int rIdx = (int)(Math.random()*cardList.size());
		Card temp = cardList.get(rIdx);
		cardList.remove(rIdx);
		
		return temp;
	}


}

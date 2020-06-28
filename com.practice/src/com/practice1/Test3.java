package com.practice1;

class Lotto {
	int[] lots= new int[6];

	public void randomNum() {
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < 6; j++) {
				if (lots[j] == 0) {
					lots[j] = random;
					break;
				} else if (lots[j] == random) {
					j--;
					break;
				}
			}
		}
	}

	public void print() {

		for (int i = 0; i < lots.length; i++) {

			if (i == lots.length - 1) {
				System.out.printf("%d", lots[i]);
			} else {
				System.out.printf("%d,", lots[i]);

			}
		}
	}
}

public class Test3 {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.randomNum();
		lotto.print();

	}
}

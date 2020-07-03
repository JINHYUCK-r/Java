package com.idiot.mission;

public class Lotto {
	static int[] count = new int[45];

	public static void main(String[] args) {

		lotto();
		for(int i:lotto()) {
			System.out.println(i);
		}
		lotto();
		lotto();
		lotto();
		lotto();
		lotto();
		lotto();
		lotto();
		countPrint(count);

	}

	public static int[] lotto() {
		int[] lottoNum = new int[6];
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lottoNum[i] == lottoNum[j]) {
					i--;
				}
			}
		}
		sort(lottoNum);
		count(lottoNum);
		return lottoNum;
	}

	public static int[] sort(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int z = 0; z < lotto.length - 1; z++) {
				if (lotto[z] > lotto[z + 1]) {
					int temp = lotto[z];
					lotto[z] = lotto[z + 1];
					lotto[z + 1] = temp;
				}
			}
		}

		return lotto;
	}

	public static int[] count(int[] lotto) {

		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (lotto[i] == j) {
					count[j - 1]++;
				}

			}

		}
		return count;
	}

	public static void countPrint(int count[]) {
		for (int i = 0; i < count.length; i++) {
			System.out.printf("%d의 갯수: %d\n", i + 1, count[i]);
		}
	}
}

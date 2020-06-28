package com.baseball;
import java.util.Scanner;

public class BaseBallGame {

	private Scanner scan = new Scanner(System.in);

	private int[] gameArr;
	private int[] myArr;
	private int strike;
	private int ball;

	public BaseBallGame(int gameNo) {
		gameArr = new int[gameNo];
		myArr = new int[gameNo];
	}

	public void gameStart() {
		setRandomValues();
		gamerule();
	}

	public void gamerule() {
		while (strike!=gameArr.length) {
			strike=0;
			ball=0;
			for (int i = 0; i < gameArr.length; i++) {
				System.out.println("숫자를 입력하세요 : ");
				int num = scan.nextInt();
				myArr[i] = num;
			}
			check();
			System.out.printf("strike : %d , ball: %d\n", strike, ball);
		}
		System.out.println("정답입니다.!!");
	}

	public void check() {
		for (int j = 0; j < gameArr.length; j++) {
			for (int z = 0; z < myArr.length; z++) {
				if (gameArr[j] == myArr[z] && j == z) {
					strike++;
				} else if (gameArr[j] == myArr[z] && j != z) {
					ball++;
				}
			}
		}
	}

	public void setRandomValues() {
		for (int i = 0; i < gameArr.length; i++) {
			int val = (int) (Math.random() * 10);
			for (int z = 0; z < i; z++) {
				if (gameArr[i] == 0) {
					gameArr[i] = val;
				} else if (gameArr[i] == val) {
					i--;
					break;
				}
			}
		}
	}
}

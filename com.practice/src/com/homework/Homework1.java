package com.homework;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
		 * int star = 3; for(int i=1; i<=star*star; i++) { System.out.print("*");
		 * if(i%star==0) { System.out.println(); } }
		 */
		/*
		 * 1번 double c=10/3.0; System.out.printf("%.1f",c);
		 */
		/* 5번 */
		System.out.println("점수를 입력해주세요: ");

		int score = scan.nextInt();

		if (score <= 100 && score >= 0) {
			switch (score / 10) {
			case 10: case 9:
				System.out.print("A");
				break;
			case 8:
				System.out.print("B");
				break;
			case 7:
				System.out.print("C");
				break;
			default:
				System.out.print("D");
				break;
			}
			if (score % 10 > 7) {
				System.out.println("+");
			} else if (score % 10 < 3) {
				System.out.println("-");
			} else {
				System.out.println("");
			}
		} else {
			System.out.println("점수를 다시 입력해 주세요");
		}
		
		/*6번
		int star = 5;
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=star-i; j++) {
				System.out.print(" ");			
			}
			for(int z=1; z<=i; z++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		*/
		/*7
		int sum=0;
		System.out.println("숫자를 입력: (종료:0)");
		int num=scan.nextInt();
		
		while(num!=0) {
			sum+=num;
			System.out.println("숫자를 입력: (종료:0)");
			num=scan.nextInt();
			
		}
		System.out.println("합계 : "+ sum);
		*/
		/* 7_1
		int i=1;
		int sum=0;
		while(i!=101) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		*/
	}

}

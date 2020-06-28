package com.practice1;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("성별을 입력해주세요 (남/여): ");
		String gender = scan.nextLine();
		System.out.println("키를 입력해주세요: ");
		int height = scan.nextInt();

		switch (gender) {

		case "남":
			if (height > 160) {
				System.out.println("평균초과입니다.");
			} else if (height == 160) {
				System.out.println("평균입니다.");
			} else if (height < 160) {
				System.out.println("평균미만입니다.");
			}
			break;
		case "여":

			if (height > 150) {
				System.out.println("평균초과입니다.");
			} else if (height == 150) {
				System.out.println("평균입니다.");
			} else if (height < 150) {
				System.out.println("평균미만입니다.");
			}
			break;
			
		default:
			System.out.println("성별을 다시 입력해 주세요");
			break;
		}

	}
}

package com.homework;

import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		int[] order= {0,0,0,0};
		int[] price= {1500,2000,3000,4000};
		String[] menu= {"아메리카노","라떼","프라프치노","비싼음료"};
		int customer;
		int sum=0;
		
		System.out.println("손님이 몇명인가요?");
		Scanner scan = new Scanner(System.in);
		customer=scan.nextInt();
		
		for(int i=0; i<customer; i++) {
			System.out.println((i+1)+"번 손님의 메뉴별 주문 갯수를 입력해주세요:");
			for(int j=0; j<4; j++) {
				System.out.println(menu[j]);
				order[j]=scan.nextInt();
				if(order[j]==99) {
					break;
				}
			}
			for(int z=0; z<4; z++) {
				sum+=(order[z]*price[z]);
			}
		}
		System.out.println(sum);
		
		
	}

}

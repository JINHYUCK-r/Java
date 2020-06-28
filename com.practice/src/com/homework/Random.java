package com.homework;

import java.util.Scanner;

public class Random {
	static int[] value= {0,0,0};
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] person= {0,0,0};
		int strike=0,ball=0;
		random();
		for(int z : value) {
			System.out.println(z);
		}
		while(strike!=3) {
		strike =0; ball=0;
		System.out.println("숫자 세개를 입력하세요: ");
		for(int i=0; i<3; i++) {
			person[i]=scan.nextInt();
		}
		
		for(int i=0; i<3; i++) {
			for(int z=0; z<3; z++) {
				if(value[i]==person[z]) {
					if(i==z) {
						strike++;
					}else {
						ball++;
					}
				}
			}
		}
		System.out.println("strike : "+ strike);
		System.out.println("ball : "+ ball);
		}
		System.out.println("정답");
	}
	public static void random() {
		for(int i=0; i<3; i++) {
			int ranV=(int)(Math.random()*9+1);
			if(value[i]==0) {
				value[i]=ranV;
			}else if(value[i]==ranV){
				i--;
			}
		}
	}
}

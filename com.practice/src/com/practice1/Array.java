package com.practice1;

public class Array {
	public static void main(String[] args) {
		int[] num = new int[5];
		for(int i=0; i<num.length; i++) {
			num[i] = i;
		}
		for(int k : num) {
			System.out.println(k);
		}
	}

}

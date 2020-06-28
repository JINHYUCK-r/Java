package com.practice1;

public class Test2 {

	public static void main(String[] args) {
		Num num = new Num();
		num.plus(1, 2);
		
		Num.minus(1, 2);
		

	}
}
	class Num{
		public int plus(int x, int y) {
			return x+y;
		}
		public static int minus(int x, int y) {
			return x-y;
		
	}

}

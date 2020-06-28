package com.practice;

public class Test2 {
	public static void main(String[] args) {
		String name;
		int inch;
		
		Test2 ts = new Test2();
		ts.sum(1, 2);
		ts.minus(1, 2);
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	private int minus(int a, int b) {
		return a-b;
	}
	

public class Tv{
	String name;
	int inch;
	boolean power;
	
	public void on() {
		System.out.println("티비를켜");
	}
	
}
}


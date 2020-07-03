package com.idiot.study;

public class A {
	public int r1;
	protected int r2;
	private int r3;
	
	public void sum(int a, int b) {
		r1=a+b;
		System.out.println(r1);
	}
	public void minus(int a, int b) {
		r2=a-b;
		System.out.println(r2);
	}
	public void apply(int a, int b) {
		r3=a*b;
		System.out.println(r3);
	}
	
	public void fnA() {
		System.out.println("A클래스");
	}

}

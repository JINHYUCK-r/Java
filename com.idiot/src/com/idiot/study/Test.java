package com.idiot.study;

public class Test {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.fnA();
		//a.fnB(); //부모클래스에서 자식클래스는 접근할수 없다.
		b.fnA();
		b.fnB();
		
		b.sum(7, 4);
		b.minus(7, 4);
		b.apply(7,4);
		b.div(7, 4);
		b.rem(7, 4);
		
		

	}

}

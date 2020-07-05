package com.idiot.mission;

public class Main {

	public static void main(String[] args) {
	Bird bird = new Bird("참새",2);
	System.out.print(bird.name);
	bird.eat();
	
	
	Tiger tiger = new Tiger();
	tiger.name="호랑이";
	tiger.leg=4;
	System.out.printf(tiger.name);
	tiger.crying();
	
	
	}
	

	

}

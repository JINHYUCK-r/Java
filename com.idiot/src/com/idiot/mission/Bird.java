package com.idiot.mission;

public class Bird extends Animal {

	Bird(String name, int leg) {
		super(name, leg);
	}
	@Override
	void eat() {
		System.out.println("쌀알냠냠");
	}
	
}

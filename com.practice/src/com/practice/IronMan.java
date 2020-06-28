package com.practice;

public class IronMan {
	String name;
	int energy;
	
	public IronMan (String name, int energy) {
		this.name=name;
		this.energy=energy;
	}
	public void attack() {
		System.out.println(name+"공격!");
	}
}

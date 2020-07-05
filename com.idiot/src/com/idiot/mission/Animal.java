package com.idiot.mission;

public class Animal {
	String name;
	int leg;
	
	Animal(String name,int leg){
		this.name=name;
		this.leg=leg;
	}
	
	Animal(){	
	}
	
 void crying() {
	 System.out.println("운다");
 }
 void eat() {
	 System.out.println("먹다");
 }
}

package com.practice1;

public class Main {
	public static void main(String[] args) {
		
		Animal animal = new Animal("고양이",20);	//생성자지정. 괄호안(파라미터,인자값)에 변수를 입력
		
		Animal animal2 = new Animal(); // 클래스명 객체이름 = new 클래스명(); 기본생성자
		animal2.name = "강아지";			//변수입력
		animal2.num = 10;				//변수입력
		
		animal.run();				//매소드 호출
		System.out.print(animal.name);
		System.out.println(animal.eat());
	}

	}

class Animal{
	String name;
	int num;	//멤버변수
	
	//생성자
	Animal(String name, int num){	//클래스이름 (멤버변수){ }
		this.name = name;	//this. 클래스의 멤버변수를 불러오겠다.
		this.num = num;
	}
	Animal(){	//기본생성자 만들기. 생성자를 만들면 이것을 만들어 주어야함.
		
	}
	public void run() {	//접근지정자 리턴타입 매소드명 (인자값, 파라미터) { 실행하는것 }
						// public{private} void{int...} 메소드명
		System.out.println("달린다.");
	}
	
	public int eat() {
	
		return 3;
	}
	 
}

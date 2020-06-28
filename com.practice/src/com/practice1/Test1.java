package com.practice1;

public class Test1 {

	public static void main(String[] args) {

		int num = 10;
		System.out.println("num: " + num);
		
		changeNum(num); // changeNum 매소드 안에 int num이라는 변수가 있음. main에 영향을 미치지못함
		System.out.println("num: " + num);
		
		ClsNum clsNum = new ClsNum();
		clsNum.num = 10; // 주소값으로 접근. 주소값.이름 / 주소값으로 접근하면 메모리의 효율이 높아짐. 무수히 많이 접근가능
		System.out.println("ClsNum.num: " + clsNum.num);
		
		changeNum(clsNum);
		System.out.println("clsNum.num: " + clsNum.num);
	}

	public static void changeNum(int num) { // 같은이름의 매서드를 만드는것을 오버로딩. 파라미터로 구분가능하게 만들면 같은이름도 가능. 자바만

		num = 20; // 매개변수는 잠깐사용. 쓰고나면 사라짐
	}
	public static void changeNum(ClsNum cn) { // cn도 주소값을 가지고 있음
		cn.num = 20; // 주소값안의 값을 바꿈
	}
}
class ClsNum {
	int num;
}

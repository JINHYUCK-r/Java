package com.practice;

public class Test {

	public static void main(String[] args) {
		Bucket buc1 = new Bucket(1);
		Bucket buc2 = new Bucket(2);
		System.out.println(buc1.equals(buc2));
	}

}
class Bucket{
	private int value;
	Bucket(int value){
		this.value=value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Bucket)) {
			return false;
		}
		Bucket buc = (Bucket)obj;
		return this.value==buc.getValue();
	}
}

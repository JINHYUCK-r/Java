package com.Study;

import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*
	// 주민번호 앞자리를 입력받아 65세 이상이면 old를 출력하는 프로그램 2020년기 
	
		System.out.println("주민번호 앞자리를 입력하세");
		
		int agecode = scan.nextInt();
		int birthYear = agecode/10000;
		
	if(birthYear>=00 && birthYear <=20) {
		System.out.println("어린");
	}else {
		if(2020-(1900+birthYear)>=65) {
			System.out.println("Old");
		}else
			System.out.println("어린");
	}
	*/
		/*
	// 두수를 입력받아 작은수에서 큰수 사이의 5의 배수 출력
		System.out.println("정수 두개를 입력하세");
	int firstNum = scan.nextInt();
	int secondNum = scan.nextInt();
	
	if(firstNum>secondNum) {
		int temp = firstNum;
		firstNum=secondNum;
		secondNum=temp;
	}
	
	int goal = firstNum;
	
	while(goal!=secondNum) {
		
		if(goal%5==0) {
			System.out.println(goal);
		}
		goal++;
	}
	*/
		/*
		//자연수입력받아서 자리수들의 합
		System.out.println("자연수를 입력하세요");
		String num = scan.next();
		
		ArrayList arraylist = new ArrayList();
		ArrayList copyarraylist = new ArrayList();
		String numarray[] = new String[num.length()];
		
		for(int i=0; i<num.length(); i++) {
			arraylist.add(num.charAt(i));
		}
		copyarraylist.add(arraylist);
		
		int j=0;
		
			for(int i=0; i<num.length(); i++) {
			arraylist.remove(i);
			System.out.println(arraylist);
			
			arraylist.addAll(copyarraylist);
			
			System.out.println();
			System.out.println(arraylist);
			System.out.println("--");
			*/
			
		/*책정
			int num = scan.nextInt();
			int sum=0;
			
			for(int n=1; n<=num; n*=10){
				if(n==1){
				int n_1 = num % n / n*n;
				sum += (num-n_1)/10;  
			}
				else{
				int n_1 = num % (n*10) / n*n;  
				int n_2 = num%n *10 - num % n;  
				sum += (num-n_1+n_2) /10;  
				}
			}
			
			
			System.out.println(sum);
			 
			 */
		/* 병진이 코드 
		package com.idiot.beatcoding;

		import java.util.ArrayList;
		import java.util.List;
		import java.util.Scanner;

		public class P43_154 {

			public static void main(String[] args) {
				Scanner scan = new Scanner(System.in);
				
				List<String> arr = new ArrayList();
				
				String input = scan.next();
				
				for (int i=0; i<input.length(); i++) {
					arr.add(i, input.substring(i,i+1));
				}
				// 배열생성용 
//				for(String test : arr) {
//					System.out.println(arr);
//				}
				int result=0;
				
				for (int i=0; i<arr.size(); i++) {
					String temp = arr.get(i);
					arr.remove(i);
					String str = "";
						for(int z=0; z<arr.size(); z++) {
							str += arr.get(z);
						}
//					if(i==arr.size()-1) {
//						System.out.println(str + " = ");
//					}
					
					if(i==arr.size()) {
						System.out.print(str);
					} else {
						System.out.print(str + " + ");
					}
					
					result += Integer.parseInt(str);
					arr.add(i, temp);
				}
				
				System.out.println(" = " + result);
				
//					String str = arr.get(i);

//				input.substring(beginIndex, endIndex)

				

			}

		}
		*/
		}
		
		
	}

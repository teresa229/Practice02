package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호는: ");
		String sign = sc.next(); //sc.nextline(); 정확한 것 같다(?)
		
		System.out.print("숫자1: ");
		double num01 = sc.nextDouble();
		
		System.out.print("숫자2: ");
		double num02 = sc.nextDouble();
		
		
	//	double sum = num01 + num02;
		if(num01!=0 && num02!=0){
			switch(sign) {
			case "+":
					System.out.println("결과는: " + (num01 + num02));
					break;
			case "-":		
					System.out.println("결과는: " + (num01 - num02));
					break;
			case "*":
					System.out.println("결과는: " + (num01 * num02));
					break;
			case "/":
					System.out.println("결과는: " + (num01 / num02));
					break;
			default:
					System.out.println("계산할 수 없는 기호입니다.");
			}
		}else {
			System.out.println("계산할 수 없습니다.");
			}
				
		sc.close();
	}
}

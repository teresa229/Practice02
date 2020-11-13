package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		double num01 = sc.nextDouble();
		
		double sum01 = Math.pow(num01, 3)- 9*num01 +2;
		double sum02 = 7* num01 + 2;
				
		if(num01<=0) {
			System.out.println("계산결과는 "+ sum01 + " 입니다.");
		}else {
			System.out.println("계산결과는 "+ sum02 + " 입니다.");
		}
		
		sc.close();
	}
}

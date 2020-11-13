package com.javaex.practice;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	int x = 0;            //문제
		int x = sc.nextInt(); //문제 해결 : 콘솔 입력
		
	//  if(x=0)              //문제(x가 0과 같으면) -> "=="으로 표현
		if(x==0) {
			System.out.println("x는 0이다.");
		}
		
		sc.close();		
		
	}
}

package com.javaex.practice;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	//	int age = 15;(콘솔입력: Scanner를 입력해주어야 한다.)
		int age = sc.nextInt();
	
	//	if(0<age<15) (동시에 2가지를 적용시킬수 없다.)
		if(0<age && age<15){
			System.out.println("청소년입니다.");
		}
		
		sc.close();
		
	}
}

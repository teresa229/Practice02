package com.javaex.practice;

import java.util.Scanner;

public class Ex03 {
	
	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age>20){
			System.out.println("\"1번 그룹\""); // \" -> "(큰따옴표 기억)
		}else {
			System.out.println("\'2번 그룹\'");
		}
		System.out.println("입니다.");
		
		sc.close();
		
	}

}

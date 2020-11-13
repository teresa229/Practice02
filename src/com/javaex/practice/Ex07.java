package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num01 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num02 = sc.nextInt();
		
		int num03 = num01/num02;
		int num04 = num01%num02;
		int num05 = num02/num01;
		int num06 = num02%num01;
		
		if(num01>num02) {
			System.out.print("몫: " + num03);
			System.out.println();
			System.out.println("나머지: " + num04);
		}else {
			System.out.print("몫: " + num05);
			System.out.println();
			System.out.println("나머지: " + num06);
		}
		
		sc.close();
		
	}
	

}

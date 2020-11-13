package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수입을 입력해 주세요.");
		System.out.print("금익: ");
		double pay = sc.nextDouble();
		
		double num01 = 0.09*pay;
		double num02 = 1000*0.09 + 0.18*(pay-1000);
		double num03 = 1000*0.09 + 3000*0.18 + 0.27*(pay-4000);
		double num04 = 1000*0.09 + 3000*0.18 + 4000*0.27 + 0.36*(pay-8000);

		
		if(0<pay && pay<=1000) {
			System.out.println("소득세는 "+ num01 + " 입니다.");
		}else if(1000<pay && pay<=4000) {
			System.out.println("소득세는 "+ num02 + " 입니다.");
		}else if(4000<pay && pay<8000) {
			System.out.println("소득세는 "+ num03 + " 입니다.");
		}else if(pay>8000){ 
			System.out.println("소득세는 "+ num04 + " 입니다.");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		
		sc.close();
	}
}

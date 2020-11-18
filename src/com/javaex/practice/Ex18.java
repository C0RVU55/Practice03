package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// 문제18
		
		int num, i, i2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		num=sc.nextInt();
		
		
		for(i2=num; i2>1; i2--) { //마지막 *하나 겹치지 않게 i2>0가 아니라 i2>1
			for(i=1; i<=i2; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
			
		for(i2=1; i2<=num; i2++) {
			for(i=1; i<=i2; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
			
		
		
		sc.close();

	}

}

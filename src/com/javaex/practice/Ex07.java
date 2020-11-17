package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//문제08 000
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int i=sc.nextInt();
		
		for(int i3=1; i3<=i; i3++) {
			for(int i2=1; i2<=i3; i2++) {
				System.out.print(i2);
			
				
			}
			System.out.println("");
		}
		
		
		sc.close();

	}

}

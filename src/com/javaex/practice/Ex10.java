package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		//문제10
				
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int num=sc.nextInt();
		}
		
		
		
		sc.close();

	}

}
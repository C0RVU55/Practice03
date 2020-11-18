package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// 문제17
		
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();
		
		/*먼저 가로로 num개 찍는 거니까 x축을 num만큼 반복해야 된다고 생각했는데
		 *애초에 x축 반복 횟수가 y축에 달려있던 거라 y축을 num만큼 반복해야 됨.*/
		
		for(int i2=num; i2>0; i2--) {
			for(int i=1; i<=i2; i++) { 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
		
		
		sc.close();

	}

}

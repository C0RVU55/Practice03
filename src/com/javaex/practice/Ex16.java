package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// 16 0000000000
		
		Scanner sc=new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();

		int sum=0;

		for(int i=1; i<=num; i++) {
			if(i%5==0) {
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println("5의 배수의 개수: "); //리스트 있어야 되는 거 아닌지?
		System.out.println("5의 배수의 합: "+sum);

		sc.close();

	}

}

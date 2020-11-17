package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 14
		
		Scanner sc=new Scanner(System.in);

		int sum=0;

		System.out.print("숫자를 입력하세요: ");
		int num=sc.nextInt();

		for(int i=1; i<=num; i++) {
			sum=sum+i;
			System.out.print(i+"+"); //마지막 +를 못뺌???
		}
		System.out.println("\n합계: "+sum);

		sc.close();

	}

}

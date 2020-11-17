package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// 11
		
		Scanner sc=new Scanner(System.in);

		int sum=0;

		while(true) {
			System.out.print("숫자를 입력하세요: ");
			int num=sc.nextInt();

			if(num==0) {
				System.out.println("홀수 또는 짝수를 입력하세요.");
			
			}else if(num%2==0) {
				for(int i=1; i<=num; i++) {
					i=i+1;
					sum=sum+i;
				}
				System.out.println(sum);
				break;
				
			}else if(num%2==1) {
				for(int i=1; i<=num; i++) {
					sum=sum+i;
					i=i+1;
				}
				System.out.println(sum);
				break;
			}
		}

		sc.close();

	}

}

package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		//문제7
		
		int i, i2, i3;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		i=sc.nextInt();
		
		for(i2=1; i2<=i; i2++) {
			for(i3=1; i3<=i2; i3++) {
				System.out.print(i2); //y축 줄 번수를 출력.
			}
			System.out.println("");
		}
		
		
		sc.close();

	}

}

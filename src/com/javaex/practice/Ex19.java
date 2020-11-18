package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// 문제19
		
		int num, save, draw;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.println("\n-----------------------------------\n1.예금 | 2.출금 | 3.잔고 | 4.종료\n-----------------------------------");
			System.out.print("선택>");
			num=sc.nextInt();
			
			if(num==1) {
				System.out.print("예금액>");
				save=sc.nextInt();
				sum=sum+save;
				
			}else if(num==2) {
				System.out.print("출금액>");
				draw=sc.nextInt();
				
					if(sum-draw<0) {
						System.out.println("잔액이 부족합니다.");
						continue;
					}
				sum=sum-draw;
				
			}else if(num==3) {
				System.out.print("잔고액>"+sum);
				
			}else if(num==4){
				System.out.println("프로그램 종료");
				break;
				
			}else {
				System.out.println("다시 입력해주세요.");
			}
		}
		
		sc.close(); //반복문이 제대로 break되지 않으면 입력받은 값 인식을 못해서(아마 반복문 안에서 계속 돌아서) 오류남.

	}

}

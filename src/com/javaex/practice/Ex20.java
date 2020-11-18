package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// 문제20
		
		int no=35; //랜덤 배우기 전이라 임의로 내가 정함.
		int num;
		String code;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=============================\n    [숫자맞추기게임 시작]\n=============================");
		
		while(true) {
			System.out.print(">>");
			num=sc.nextInt();
			
			if(num<no) {
				System.out.println("더 높게");
			}else if(num>no) {
				System.out.println("더 낮게");
			}else {
				System.out.print("맞았습니다.\n게임을 종료하시겠습니까? (y/n) >>");
				code=sc.next();
					if(code.equals("n")) {
						System.out.println("=============================\n    [숫자맞추기게임 시작]\n=============================");
						continue;
					}else if(code.equals("y")) {
						System.out.println("\n=============================\n    [숫자맞추기게임 종료]\n=============================");
						break;
					}else {
						System.out.println("잘못 입력했습니다. 게임을 다시 시작합니다.");
						System.out.println("=============================\n    [숫자맞추기게임 시작]\n=============================");
						continue;
					}
			}
		}
		
		sc.close();

	}

}

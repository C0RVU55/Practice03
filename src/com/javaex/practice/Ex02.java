package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		//문제2
		
		//결과 : ***\n***\n***\n*** --> **\n**\n**\n** 조건 잘못 봄.
		
		int x,y;
		for(x=0; x<4; x++) {
			for(y=0; y<2; y++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

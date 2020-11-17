package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		//문제3
		
		//결과 : **\n**\n** --> ***\n***\n***\n*** 변수 0이라고 실행이 안 되는 건 아님. 어쨌든 조건은 충족했으니까 실행됨.
		
		int x,y;
		for(x=0; x<4; x++) {
			for(y=2; y>=0; y--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

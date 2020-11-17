package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		//문제1
		
		//결과 : while문과 for문 둘 다 같은 결과임.
		
		System.out.println("while문");
		int index=0;
		while(index<3) {
			System.out.println("index="+index);
			index++;
		}
		
		System.out.println("for문");
		for(int order=0; order<3; order++) {
			System.out.println("order="+order);
		}

	}

}

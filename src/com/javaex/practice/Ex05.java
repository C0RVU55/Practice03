package com.javaex.practice;

public class Ex05 {
	
	public static void main(String[] args) {
		//문제5
		
		//결과 : 12345
		
		int i=1;
		boolean flag=true;
		
		while(flag) {
			if(i>=5) {
				flag=false;
			}
			System.out.println(i);
			i=i+1;
		}
	}
}

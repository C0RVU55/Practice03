package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		//문제9
		
		int i, i2;
		
		for(i2=0; i2<10; i2++) {
			for(i=1; i<=10; i++) {
				System.out.print(i+i2);
				
				if(i+i2<10) { //정렬 간격 맞추기
					System.out.print("     ");
				}else {
					System.out.print("    ");
				}
			}
			System.out.println("");		
		}

	}

}

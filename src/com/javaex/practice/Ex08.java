package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		//문제8
		
		int dan, i;
		
		for(i=1; i<10; i++) {
			for(dan=2; dan<10; dan++) {
				System.out.print(dan+"*"+i+"="+dan*i);
				if(dan*i<10) { //정렬 간격 맞추기
					System.out.print("   ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	
	}

}

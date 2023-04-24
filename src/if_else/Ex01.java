package if_else;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
/*
 제어문 : 프로그램의 흐름을 제어하는 것
 if, switch, for, while, break, continue...
 
 if(조건식)
  	종속문장
 if(조건식){
 	종속문장
 	종속문장
 	종속문장
 }
		*/
		Scanner scan = new Scanner(System.in);
		int num_scan;
		
		System.out.println("1. 쉬운게임");
		System.out.println("2. 어려운게임");
		System.out.print(">>> : ");
		
		num_scan = scan.nextInt();
		if(num_scan ==1) System.out.println("쉬운게임을 실행합니다");
		if(num_scan ==2) System.out.println("어려운게임을 실행합니다");
		System.out.println("다음문장들 실행");
		
	
	}
}

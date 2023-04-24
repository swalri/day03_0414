package if_else;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num_scan;
		/*
		System.out.print("수 입력 : ");
		num_scan = scan.nextInt();
		if(num_scan>10) {
			System.out.println("1.종속문장 실행");
			System.out.println("2.종속문장 실행");
			System.out.println("3.종속문장 실행");
		}
		System.out.println("다음 문장들 실행");
		*/
		String msg = null;
		System.out.print("수 입력 : ");
		num_scan = scan.nextInt();
		if(num_scan % 2 == 0)msg = "짝수";
		if(num_scan % 2 != 0)msg = "홀수";
		
		System.out.println("입력 값은 "+msg+" : "+num_scan);
		
		System.out.println("다음 문장들 실행");
		
	}
}

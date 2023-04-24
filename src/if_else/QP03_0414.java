package if_else;

import java.util.Scanner;

public class QP03_0414 {
	public static void main(String[] args) {
		
		//이름과 점수를 입력해 성적을 표현하는 프로그램
		
		Scanner scan = new Scanner(System.in);
		int num_scan;
		String p="F", name;
	
		System.out.print("이름을 입력 :");
		name = scan.nextLine();
		System.out.print("성적을 입력 : ");
		num_scan = scan.nextInt();
		
		if(num_scan >= 60) p = "D";
		if(num_scan >= 70) p = "C";
		if(num_scan >= 80) p = "B";
		if(num_scan >= 90) p = "A";
		
		System.out.println("이름 : "+name);
		System.out.println("점수 : "+num_scan);		
		System.out.println("성적 : "+p);		
		
	}
}

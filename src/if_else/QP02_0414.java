package if_else;

import java.util.Scanner;

public class QP02_0414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//수를 입력받아 입력받은 값을 절대값으로 출력하세요
		//절대값 |num| : 결과적으로 양의 값, 부호가 없는값
		// -10 => 10 , 10 => 10
		Scanner scan = new Scanner(System.in);
		int num_scan, num1 = 0; //입력수, 절대값
		
		System.out.print("수를 입력 : ");
		num_scan = scan.nextInt();
		num1 = (num_scan>0)?num_scan:-num_scan;
//		if(num_scan > 0) num1 = num_scan;
//		if(num_scan < 0) num1 = -num_scan;
		
		System.out.println("입력수 : "+num_scan+"의 절대값은 : "+num1);
	}

}

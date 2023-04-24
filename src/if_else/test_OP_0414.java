package if_else;

import java.util.Scanner;

public class test_OP_0414 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		float sum = 0;
		String oper;
		
		System.out.println("간단한 계산기");
		System.out.print("수를 입력해 주세요 : ");
		num1 = scan.nextInt();
		System.out.print("연산자를 입력해 주세요 ex)+, -, *, /  => ");
		oper = scan.next();
		System.out.print("수를 입력해 주세요 : ");
		num2 = scan.nextInt();

		switch (oper){
		case "":
		default:
		}
		
		
		if(oper.equals("+")) sum = num1 + num2;
		if(oper.equals("+")) sum = num1 + num2;
		if(oper.equals("-")) sum = num1 - num2;
		if(oper.equals("*")) sum = num1 * num2;
		if(oper.equals("/")) sum =  num1 / (float)num2;
		
		System.out.println(num1 +oper +num2 +" = "+sum);
		
		
		
		
	}

}

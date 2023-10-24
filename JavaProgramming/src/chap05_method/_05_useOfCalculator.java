package chap05_method;

import java.util.Scanner;

import chap05_method.calc.CompleteCalculator;

public class _05_useOfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		String operator = "";
		
		System.out.println("정수를 입력하세요.");
		num1 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		num2 = sc.nextInt();
		sc.nextLine();
		System.out.println("연산자를 입력하세요.(+, -, *, /, %)");
		operator = sc.nextLine(); 
		
		int result = 0;
		CompleteCalculator ccalc = new CompleteCalculator();
		
		//ComCalculator의 메소드 5개 결과 값을 출력하세요.
		//메소드에 전달할 매개변수는 사용자가 입력하는 num1, num2
		if(operator.equals("+")) {
			result = ccalc.add(num1, num2);
			System.out.println(num1 + " + " + num2 + " = " + result);
		} else if(operator.equals("-")) {
			result = ccalc.min(num1, num2);
			System.out.println(num1 + " - " + num2 + " = " + result);
		} else if(operator.equals("*")) {
			result = ccalc.mul(num1, num2);
			System.out.println(num1 + " * " + num2 + " = " + result);
		} else if(operator.equals("/")) {
			result = ccalc.div(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
		} else if(operator.equals("%")) {
			result = ccalc.mod(num1, num2);
			System.out.println(num1 + " % " + num2 + " = " + result);
		} else {
			System.out.println("연산자를 잘못 입력하셨습니다.");
		}
		
		sc.close();
	
	int result1;
	double dResult;
	
	int num3 = 115;
	int num4 = 27;
	
	result1 = ccalc.add1(num3, num4);
	System.out.println("num3 + num4 = " + result1);
	
	result1 = ccalc.add1(num3, num4);
	System.out.println("num3 - num4 = " + result1);
	
	result1 = ccalc.add1(num3, num4);
	System.out.println("num3 * num4 = " + result1);
	
	result1 = ccalc.add1(num3, num4);
	System.out.println("num3 / num4 = " + result);
	
	result1 = ccalc.add1(num3, num4);
	System.out.println("num3 % num4 = " + result);
	} 
}

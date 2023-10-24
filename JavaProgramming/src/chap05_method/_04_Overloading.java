package chap05_method;

import chap05_method.calc.OverloadingCalculator;

public class _04_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingCalculator ocalc = new OverloadingCalculator();
		
		int result; 
		
		result = ocalc.mul(10, 5);
		System.out.println("ocalc.mul(10, 5) - " + result);
		
		result = ocalc.mul(10);
		System.out.println("ocalc.mul(10) = " + result);
		
		//매개변수의 순서도 항상 지켜줘야된다.
		result = ocalc.mul(10, 5.0);
		System.out.println("ocalc.mul(10, 5.0) = " + result);
		
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		double dNum = 30.0;
		
		int result1;
		
		result1 = ocalc.mul(num1);
		System.out.println(result1);
		
		result1 = ocalc.mul(num1, dNum);
		System.out.println(result1);
		
		
	}
	

}
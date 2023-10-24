package chap05_method;

import java.util.Scanner;

public class _09_MethodEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("정수를 입력하세요.");
		int userNum = sc.nextInt();
		
	printDivisor(userNum);
	
	sc.close();
		
		
		
	}
	
	//사용자가 입력한 정수의 모든 약수를 출력하는 메소드 printDivisor를 구현하세요.
	public static void printDivisor(int num) {
		for(int i = 1; i <= num; i++) {
		if (num % i == 0) {
			System.out.println(i + "는 약수 입니다.");
		
		}
			
	}
	
		
	}
}
	



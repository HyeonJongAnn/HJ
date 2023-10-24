package chap05_method;

import java.util.Scanner;

public class _07_MethodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하세요");
		int num2 = sc.nextInt();
		
		//사용자가 입력한 두 정수 중에 큰 수를 출력하는 메소드 compareTwoNum을 완성하세요.
		compareTwoNum(num1, num2);
		
		
		sc.close();
	}
 
	public static void compareTwoNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + "가 더 큽니다.");
		} else if (num1 < num2) {
			System.out.println(num2 + "가 더 큽니다.");
		} else {
			System.out.println("같은 숫자 입니다");
		} 
	}
}

package chap04_controlstatement;

import java.util.Scanner;

public class _16_ForIfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String userString = sc.nextLine();
		
		System.out.println("사용자가 입력한 문자열 : " + userString);
		//String.length(): 저장된 문자열의 길이를 알려준다.
		System.out.println("사용자가 입력한 문자열의 길이 : " 
										+ userString.length());
		
		//String.charAt(index): index번호에 해당하는 문자 하나를 리턴
		//컴퓨터는 0부터 숫자를 세기 때문에 index 항상 0부터 시작
		//"java".charAt(0) => 'j'
		//문자열의 마지막 index는 항상 문자열의 길이 - 1
		for(int idx = 0; idx < userString.length(); idx++) {
			System.out.println(userString.charAt(idx));
		}
		
		//입력한 문자열을 거꾸로 하나씩 출력
		for(int idx = userString.length() - 1; idx >= 0; idx--) {
			System.out.println(userString.charAt(idx));
		}
		
		//1. 1~1000까지 정수에서 7과 11의 공배수의 합을 출력하세요.
		int sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 7 == 0 && i % 11 ==0) {
				sum += i;
			}
		}
		
		System.out.println("1~1000 사이의 7과 11의 공배수의 합: " + sum);
		
		//2. 1~1000까지 정수에서 7과 11의 공배수의 합이 500을 넘었을 때의 합을 출력하세요.
		sum = 0;
		
		for(int i = 1; i <= 1000; i++) {
			if(i % 7 == 0 && i % 11 ==0) {
				sum += i;
				System.out.println(i);
				if(sum > 500) {
					break;
				}
			}
		}
		
		System.out.println("1~1000 사이의 7과 11의 공배수의 "
							+ "합이 최초로 500을 넘었을 때의 값: " + sum);
		
		
		
		
		
		
		
		
		
		
	}

}

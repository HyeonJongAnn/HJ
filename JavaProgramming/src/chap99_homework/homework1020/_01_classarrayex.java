package chap99_homework.homework1020;

import java.util.Scanner;

public class _01_classarrayex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요:");
		String st = sc.next();
		System.out.println("문자 입력 : ");
		char j = sc.next().charAt(0);

		int count = 0;
		
		for (int i = 0; i < st.length(); i++) {
			if(st.charAt(i) == j) count++; 
			
		}
		System.out.println(" 가의 개수 : " + count);
	
			
	
		
		
		
	}

}

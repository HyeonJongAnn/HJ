package chap05_method;

import java.util.Scanner;

public class _08_MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num3 = sc.nextInt();
		
		//사용자가 입력한 세 정수의 크기를 비교하여
		//최대값: 100, 중간값: 72, 최소값: 50
		//출력하는 메소드 compareThreeNum을 완성하세요
		compareThreeNum(num1, num2, num3);
		
		sc.close();
	}
	public static void compareThreeNum(int a, int b, int c)  {
		int max = 0;
		int mid = 0;
		int min = 0;
		 
		//if문에 걸리지 않으면 b>a true가 된다.
		if (a > b) {
			if(b > c) {
				max = a;
				mid = b;
				min = c;
			} else if(a > c) {
				max = a;
				mid = c;
				min = b;
			} else {
				max = c;
				mid = a;
				min = b;
			}
		}
		//b > a 상태
		else if (a > c) {
			max = b;
			mid = a;
			min = c;
		}
		// b > a && c > a 상태
		else if(b > c) {
			max = b;
			mid = c;
			min = a;
		}
		else {
			max = c;
			mid = b;
			min = a;
			
		}
	
	
		System.out.println("최대값: " + max + ", 중간값: " + mid + ", 최소값: " + min);
	
	}

}

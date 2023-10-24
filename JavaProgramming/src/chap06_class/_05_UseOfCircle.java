package chap06_class;

import java.util.Scanner;

import chap06_class.circle.Circle;

public class _05_UseOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		
		System.out.println("반지름을 입력하세요.");
		int radius = sc.nextInt(); 
		 
		//반지름의 값이 circle안의 radius에 저장됨.
	    Circle circle = new Circle(radius);
		System.out.println(circle.radius);
		
		
		System.out.println("원 둘레: " + circle.circleRound());
		System.out.println("원 넓이: " + circle.circleArea());
	}

}

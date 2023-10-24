package chap05_method.calc;

public class OverloadingCalculator {
	public int mul(int a, int b) {
		return a * b;		
	}

	// 오버로딩된 메소드: 매개변수의 타입, 개수, 순서를 변경해서 같은 이름의 메소드를 선언한다.
	public int mul(int a) {
		return a * a; 
	}
	
	public int mul(int a, double b) {
		return (int) (a * a * b * b);
	}
	public int mul(int a, int b, int c) {
		return a * b * c;
	}
	
	
	
	
	}


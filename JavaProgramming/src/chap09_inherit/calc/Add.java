package chap09_inherit.calc;

public class Add extends Calculator {
	int c;
	public Add() {
		
	}
	
	
	public Add(int a, int b) {
		super(a, b);
		
		
	}
 

	// 오버라이딩된 메소드
		public int calculate() {
			return a + b;
		}
		
	
	
	
	
}

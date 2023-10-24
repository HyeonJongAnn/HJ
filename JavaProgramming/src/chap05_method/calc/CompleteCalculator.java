package chap05_method.calc;

public class CompleteCalculator {
	//int 형 매개변수 2개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산해주는
	//메소드 5개(모두 리턴타입 int형)
	
	public int add (int num1, int num2) {
		return num1 + num2;	
	}
	
	public int min (int num1, int num2) {
		return num1 - num2;
	}
	
	public int mul (int num1, int num2) {
		return num1 * num2;
	}
	
	public int div (int num1, int num2) {
		if(num2 != 0) {
			return (int) (num1 / num2);
		} else {
			return 0;
		}
	}
	
	public int mod (int num1, int num2) {
		if(num2 != 0) {
		return num1 % num2;
		} else {
			return 0;
			}

		
		
		
		
		
		
		
		
		
		}
	//int형 매개변수 두개를 받는 메소드 add(덧셈), sub(뺄셈), mul(곱셈), div(나눗셈)
	//mod(나머지) 5개를 선언하세요. (div 메소드만 리턴타입 double, 나머지는 int)
	//나눗셈과 나머지 분모에 0이 들어오면 0을 리턴하도록 하세요.
	public int add1 (int num3, int num4) {
		return num3 + num4;
		
	}
	
	public int sub (int num3, int num4) {
		return num3 - num4;
	}
	
	public int mul1 (int num3, int num4) {
		return num3 * num4;
	}
	
	public double div1 (int num3, int num4) {
		if(num4 == 0) {
			return 0;
		}else {
			return (double)num3/num4;
		}
	}
	
	public int mod1 (int num3, int num4) {
		if(num4 == 0) {
			return 0;
		}else {
			return num3%num4;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
  
   
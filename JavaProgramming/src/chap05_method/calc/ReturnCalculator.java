package chap05_method.calc;

public class ReturnCalculator {
	// 1. 결과값이 없는 메소드
	public void add() {
		System.out.println(10 + 20);
	//void 형태의 메소드에서 return문을 사용하면 에러 발생
//  return null;
	}
	
	// 2. 결과 값이 int형인 메소드
	// 결과 값이 있는 메소드는 항상 return 구문 사용
	public int sub() {
		return 10 + 20;
	}
	
	// 3. 결과 값이 double인 메소드
	public double div() {
		return (double)20.0 / 10;  
	}
	
	// 4. 결과 값이 String인 메소드
	public String hello() {
		return "hello java"; 
	}
	
	public int[] createArray() {
		return new int[5];
		
//		int[] intArr = new int[5];
//		return intArr;
	}
	
	
	
	
	
	
}

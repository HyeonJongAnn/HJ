package chap05_method.calc;

public class ParameterCalculator {
//	ParameterCalculator p = new ParameterCaculator();
//	
//	p.add(19, 20);
	// 메소드의 선언은 메소드의 형태를 만들어 준다.
	// 메소드를 사용할 때는 항상 만들어진 형태와 동일한 형태로 호출하여 사용한다.
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public double div(int a, int b) {
		return (double)a / b; 
	}

	public String addString(String a, String b) {
		return a + " " + b; 
	}
}

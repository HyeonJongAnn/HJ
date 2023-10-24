package chap05_method;

import chap05_method.calc.ReturnCalculator;

public class _02_ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCalculator rcalc = new ReturnCalculator();
		
		//기능만 하는 메소드(결과값이 없는 메소드)의 호출
		rcalc.add();
		
		//결과 값이 있는 메소드의 호출
		//결과 값이 있는 메소드는 결과 값을 변수에 저장하거나 다른 연산에 사용하지 않으면
		//의미 없는 값이 된다.
		rcalc.div();  
		
		// 결과 값이 있는 메소드는 결과 값과
		// 같은 타입의 변수에 저장을 하던가
		// 다른 메소드에 전달해서 바로 사용한다.
		double dNum = rcalc.div();
		System.out.println(dNum);
		System.out.println(10 * dNum);
		
		String str = rcalc.hello();
		System.out.println(str);
		
		int[] intArr = rcalc.createArray();		
		
		
		
		
		
		
	}

}

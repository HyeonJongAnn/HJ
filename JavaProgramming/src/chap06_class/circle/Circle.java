package chap06_class.circle;

public class Circle {
	public final double PI = 3.14;
	public int radius;
	 
	public Circle()  {
		
	}
	//초기화 : 객체를 선언하고 값을 '최초'로 할당하는 것
	//반지름을 받아서 초기화하는 생성자
	public Circle (int radius) {
	this.radius = radius;
	
	}
	//원의 둘레를 리턴하는 메소드(2 * PI * radius)
	public double circleRound() {
		return (2 * PI * radius);
	}
	
	
	//원의 넓이를 리턴하는 메소드(PI * radius * radius)
	public double circleArea() {
		return(PI * radius * radius);
	}
	
	
	
	
	
	
	
	
	
}


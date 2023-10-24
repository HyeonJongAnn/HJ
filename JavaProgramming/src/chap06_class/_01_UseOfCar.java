package chap06_class;

import chap06_class.car.Car;

public class _01_UseOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수로 객체 생성
		Car car = new Car();
		 
		 
		//객체의 속성값이나 메소드에 접근할 때는 변수명. 으로 접근한다.
		//속성들에 값 지정
		car.company = "현대";
		car.model = "제네시스";
		car.price = 50000000;
		car.color = "black"; 
		
		//기능호출하여 사용
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnOff();
		
		car.carInfo();
		
		

	}
	
	//클래스도 하나의 타입이라 메소드의 리턴 타입이나 매개변수로도 사용할 수 있다.
	public static Car generateCar(Car car) {
		return new Car();
	}

}

package chap06_class.car;

public class CarConstructor {
	// 자동차의 속성들
	public String company;
	public String model;
	public int price;
	public String color;
	
	// 생성자는 속성과 기능사이에 정의한다.
	// 접근제어자 + 클래스명() {}
	public CarConstructor() {
		
	}
	
	// 생성자에서 받아오는 매개변수는 어떤 변수를 초기화할지 명확하게 하기위해
	// 속성 변수명이랑 일치 시켜주는 경우가 많다.
	public CarConstructor(String company) {
		// this: 생성자를 통해서 만들어지는 객체를 지칭하는 키워드(CarConstructor 객체를 의미)
		this.company = company; 
//		company = company; 
	}
	 
	public CarConstructor(String company, String model, int price, String color) {
		this.company = company;
		this.model = model;
		this.price = price;
		this.color = color;		
	}

	//기능
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void speedUp() {
		System.out.println("속도를 올린다.");
	}
	
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	
	public void carInfo() {
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("가격 " + price);
		System.out.println("색상 " + color);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

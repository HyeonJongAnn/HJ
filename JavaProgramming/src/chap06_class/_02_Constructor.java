package chap06_class;

import chap06_class.car.CarConstructor;

public class _02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		car.company = "현대";
//		car.model = "제네시스";
//		car.price = 50000000;
//		car.color = "black";
		CarConstructor car = new CarConstructor("현대", "제네시스", 50000000, "black");
		CarConstructor car1 = new CarConstructor();
		 
		
		car.carInfo();
		System.out.println("--------------------");
		car1.carInfo();  
		
	}

}

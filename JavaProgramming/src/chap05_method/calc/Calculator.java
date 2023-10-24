package chap05_method.calc;

//클래스의 접근제어자는 public, default만 허용
public class Calculator {
	
	//public: 어디서나 접근 가능
	public void add() {
		System.out.println(10 + 20);
	}
	
	//protected: 같은 클래스, 같은 패키지내의 클래스, 자식클래스에서 접근 가능
	protected void min() {
		System.out.println(20 - 10);
	}
	
	//default: 같은 클래스, 같은 패키지 내의 클래스에서 접근 가능
	void div() {
		System.out.println(20 / 10);  
	}
	
	//private: 같은 클래스에서 접근 가능
	private void mul() {
		System.out.println(10 * 20);
	}
}

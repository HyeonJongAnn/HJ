package chap12_interface.device;

// interface끼리의 상속은 extends를 사용한다.
public interface Tv extends Speaker, Display {
	void changeChannel(int channel);
	
}

package chap99_homework.homework1019.employee01;

public class CivilServant extends Employee {
	
	@Override
	public void goToWork() {
		System.out.println("출근해서 커피를 마신다.");
	}
	@Override
	public void leaveWork() {
		System.out.println("퇴근해서 저녁을 먹다.");
	}
	@Override
	public void work() {
		System.out.println("업무 보고서를 올린다.");
	}
		
	
	
}

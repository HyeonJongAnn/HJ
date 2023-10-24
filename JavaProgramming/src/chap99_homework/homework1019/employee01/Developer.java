package chap99_homework.homework1019.employee01;

public class Developer extends Employee {

	@Override
	public void goToWork() {
		System.out.println("자차로 출근을 한다.");
	}
	@Override
	public void leaveWork() {
		System.out.println("퇴근후에도 집에서 업무를 본다.");
	}
	@Override
	public void work() {
		System.out.println("회의를 가진다.");
	}
}

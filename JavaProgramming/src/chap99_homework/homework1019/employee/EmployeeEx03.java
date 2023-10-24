package chap99_homework.homework1019.employee;

public class EmployeeEx03 extends Employee{
	private int hireYear;

	
	public EmployeeEx03(int eno, String name, int pay, int type, int hireYear) {
		super(eno, name, pay, type);
		this.hireYear = hireYear;
	}

	@Override
	public double getMonthPay() {
		// TODO Auto-generated method stub
		return this.getPay()/12;
	}
	
	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무년수 : " + this.hireYear);
		System.out.println("월급 : " + this.getMonthPay());
	}
}


package chap06_class.student;

public class Student {
	//속성
	//이름, 학번, 학과
	public String name;
	public int id;
	public String major;
	
	//기본생성자
	public Student () { 
		
	}
	//이름, 학번, 학과를 초기화하는 생성자
	public Student (String name, int id, String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}
	
	
	//학생의 정보를 출력하는 메소드
	public void studentInfo() {
		System.out.println("이름: " + name);
		System.out.println("학번: " + id);
		System.out.println("학과: " + major);
	}
	





}
	


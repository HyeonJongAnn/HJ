package homework_01.basic;

public class Student {

	public String name; 
	public int id;
	public String major;
	
	public Student() {
		
	}
	
	public Student(String name,int id,String major) {
		this.name = name;
		this.id = id;
		this.major = major;
	}
	
	public void studentInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학번 : " + id);
		System.out.println("학과 : " + major);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

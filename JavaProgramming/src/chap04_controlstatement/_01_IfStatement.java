package chap04_controlstatement;

public class _01_IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lunchPrice = 10000;
		
		if(lunchPrice >= 10000)	{
			System.out.println("비싸다.");
		} else if(lunchPrice >= 8000) {
			System.out.println("적정하다");
		} else if(lunchPrice >= 6000) {
			System.out.println("조금 싸다.");
		} else {
			System.out.println("혜자다.");
		}
		System.out.println("---------------");
		
		//대문자는 소문자로 소문자는 대문자로 변경해서 출력
		char ch = 'c';
		char convertCh;
		
		//삼항연산자에서 if구문으로 변경
		if(ch >= 'A' && ch <= 'Z') {
			convertCh = (char)(ch + 32);
		} else if(ch >= 'a' && ch <= 'z') {
			convertCh = (char)(ch - 32);
		} else {
			convertCh = 0;
		}
		
		if(convertCh != 0) {
			System.out.println(convertCh);
		}
	}	
		


}
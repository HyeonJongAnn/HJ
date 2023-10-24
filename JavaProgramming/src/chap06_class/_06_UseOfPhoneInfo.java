package chap06_class;

import java.util.Scanner;

import chap06_class.phone.PhoneInfo;

public class _06_UseOfPhoneInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo phoneInfo = new PhoneInfo();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-----연락처목록-----");
			System.out.println("1. 정보 입력");
			System.out.println("2. 모든 연락처 조회");
			System.out.println("3. 종료");
			
			String userInput = sc.nextLine();
			
			if(userInput.equals("1")) {
				System.out.println("이름을 입력하세요.");
				String name = sc.nextLine();
				
				System.out.println("전화번호를 입력하세요.");
				String phone = sc.nextLine();
				
				phoneInfo.savePhoneInfo(name, phone);
				
			} else if(userInput.equals("2")) {	
				phoneInfo.printAllPhoneInfo();
			} else if(userInput.equals("3")) {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue; 
			}
			
		}
	}

}

package chap04_controlstatement;

import java.util.Scanner;

public class _13_BreakContinueWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 정보입력");
			System.out.println("2. 종료");
			
			String userInput = sc.nextLine();
			
			if(userInput.equals("1")) {
				while(true) {
					System.out.println("이름을 입력하세요.(종료하려면 q 입력)");
					String name = sc.nextLine();
					
					if(name.equals("q")) {
						break;
					}
				}
			} else if(userInput.equals("2")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
		
		//스캐너 객체 메모리에서 삭제
		//스캐너 객체에 null값을 대입해서 더이상 사용되지 않는다고 GC에 알려주는 역할
		sc.close();
	}

}

package chap04_controlstatement;

public class _09_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 2~9단까지 구구단 출력
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j 
						+ " = " + (i * j) + "   ");
				
			}
			System.out.println();
		}
		
		//2. 
//		*****
//		*****
//		*****
//		*****
//		*****
		for(int k = 1; k <= 5; k++) {
			for(int l = 1; l <= 5; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//3. 
//		*
//		**
//		***
//		****
//		*****
		//중첩 for문에서 조건을 걸어서 위 모양으로 출력
		for(int k = 1; k <= 5; k++) {
			for(int l = 1; l <= 5; l++) {
				//k = 1, l = 1
				//k = 2, l = 1, 2
				//k = 3, l = 1, 2, 3
				//k >= l
				if(k >= l)
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package homework;

import java.util.Random;
import java.util.Scanner;

public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.
		int num = 10;
		System.out.println(++num);
		System.out.println(++num);
		System.out.println(num--);
		System.out.println(--num);
		System.out.println(num--);
		System.out.println(--num);
		
		//2.
		int a = 10;
		int b = 20;
		
		System.out.println( a < 11);
		System.out.println( b > 20);
		 
		//3.
		int i = 10;
		while(i>=1) {
			System.out.println(i + "");
			i--;
		}
		
		//4.
		int j = 10;
		do {
			System.out.println(j + "");
			j--;
		}while(j>=1); {
		}  
		
		//5.
		for(int k = 10; k>=1; k--) {
			System.out.println(k + "");
		}
		
		//6.
		int sum = 0;
		
		int c = 1;
		
		while(c<=100) {
			sum += c;
			c++;
		}
		System.out.println("1~" + (c-1) + "합 : " + sum);
		
		//7.
		do {
			System.out.println("1~" + (c-1) + "합 : " + sum);
			
		}while(c<=100); {
			
			c++;
		}  
		
		//8.
		int sum1 = 0;
		int d;
		for(d = 1; d<=100; d++) {
			sum1 += d;
		}
			 
			System.out.println("1~" + (d-1) + "합 : " + sum1);
		
			
		//9.
		int number1=0, number2=0, number3=0, number4=0, number5=0, 
		number6=0, number7=0, number8=0, number9=0, number10=0, result;

		Scanner sc = new Scanner(System.in);

	    System.out.println("배열(1)을 입력 하세요 >>");
	    number1 = Integer.parseInt(sc.next());
	    
	    System.out.println("배열(2)을 입력 하세요 >>");
	    number2 = Integer.parseInt(sc.next());
	    
	    System.out.println("배열(3)을 입력 하세요 >>");
	    number3 = Integer.parseInt(sc.next());
	    
		System.out.println("배열(4)을 입력 하세요 >>");
		number4 = Integer.parseInt(sc.next());
		
		System.out.println("배열(5)을 입력 하세요 >>");
		number5 = Integer.parseInt(sc.next());
		
		System.out.println("배열(6)을 입력 하세요 >>");
		number6 = Integer.parseInt(sc.next());
		
		System.out.println("배열(7)을 입력 하세요 >>");
		number7 = Integer.parseInt(sc.next());
		
		System.out.println("배열(8)을 입력 하세요 >>");
		number8 = Integer.parseInt(sc.next());
		
		System.out.println("배열(9)을 입력 하세요 >>");
		number9 = Integer.parseInt(sc.next());
		
		System.out.println("배열(10)을 입력 하세요 >>");
		number10 = Integer.parseInt(sc.next());
		
		result = number1 + number2 + number3 + number4 + number5 + number6 + number7 + number8 + number9 + number10;
		System.out.println("result : " + result);
		
		//11.
		Random random = new Random();
        int[] newArr = new int[10];
        
		
		for(int y = 0; y < newArr.length; y++) {
			newArr[y] = random.nextInt(10) + 1;
			
				System.out.println(newArr[y]);
		}
		//12.
		
		 
		}
		}	


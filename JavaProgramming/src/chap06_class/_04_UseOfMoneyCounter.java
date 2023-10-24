package chap06_class;

import java.util.Scanner;

import chap06_class.money.MoneyCounter;

public class _04_UseOfMoneyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoneyCounter mc = new MoneyCounter(); 
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("정수를 입력하세요.");
		int a = sc.nextInt();
		
		mc.allCount(a);
		 
		mc.printMoneyCount();
		
		sc.close();
	}

}

package chap05_method;

import chap05_method.game.Lotto;

public class _11_LottoMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		int[] lottoArray = lotto.generateRandomArray();
		
		
		System.out.print("이번주 로또 번호는");
		
		for(int i = 0; i < lottoArray.length; i++) {
			if(i == lottoArray.length - 1) {
				System.out.println("보너스번호: " + lottoArray[i]);
			}else {
				System.out.println(lottoArray[i] + ", ");
			}
		}
		
		
	}

}

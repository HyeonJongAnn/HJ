package chap06_class.game;

import java.util.Random;

public class Lotto {
	//속성
	//1~45 랜덤 값 7개를 가질 배열
	//{0, 1, 2, 3, 4, 5, 6:보너스번호}
	int[] lotto = new int[7];

	//보너스번호가 맞았는지 검사하는 변수
	public boolean bonus = false;
	
	//기본생성자(배열에 랜덤값 7개 저장)
	public Lotto() {
		Random random = new Random();
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			//중복제거
			if(i > 0) {
				if(isDuplicated(lotto, i)) {
					i--;
					continue;
				}
			}
			
		}	
	}
	
	
	
	 
			//중복체크하는 메소드
			public boolean isDuplicated(int []arr, int idx) { 
				for(int i = 0; i < idx; i++) {
					if(arr[idx] == arr[i]) {
						return true;
					}
				}
				return false;	
			}
	//로또번호 출력하는 메소드
	public void printLottoNum() {
		System.out.println("이번주 로또 번호는");	
			
		for(int i = 0; i < lotto.length; i ++)
			if(i == lotto.length - 1) {
				System.out.println("보너스 번호: " + lotto[i]);
			} else {
				System.out.println(lotto[i] + ", ");
			}
	}
	
	//로또번호와 사용자번호 비교하는 메소드
	public int compareNum(int[] user) {
		int correctCnt = 0;
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < user.length; j++) {
				//lotto[0] => user[0], user[1], ... user[5]
				if(lotto[i] == user[j]) {
					//번호를 맞춘상황에서
					if(i == lotto.length - 1) {
						//lotto배열의 마지막 값이랑 같으면 보너스 번호가 맞은 상황
						//맞은 개수는 증가시키지 않고 bonus만 true로 바꿔줌
						bonus = true;
					} else {
						correctCnt++;
					}
				}
			}
		}
		return correctCnt;
	}
	
	
	
	
	
	
	
	
	
	
}
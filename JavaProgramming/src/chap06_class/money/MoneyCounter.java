package chap06_class.money;

public class MoneyCounter {
	public int omanCnt;
	public int manCnt;
	public int ochCnt;
	public int chCnt;
	public int obakCnt;
	public int bakCnt;
	public int osipCnt;
	public int sipCnt;
	
	//매개변수로 받아온 금액(정수 하나)이 오만원 몇장, 만원 몇장, 오천원 몇장, 천원 몇장, 오백원 몇개,
	//백원 몇개, 오십원 몇개, 십원 몇개인지 위의 속성에 각각 저장하는 메소드
	public void allCount(int money) {
		omanCnt = money / 50000;
		money %= 50000;
		
		manCnt = money / 10000;
		money %= 10000; 
        
		ochCnt = money / 5000;
		money %= 5000;
                
		chCnt = money / 1000;
		money %= 1000;
            
		obakCnt = money / 500;
		money %= 500;
            
		bakCnt = money / 100;
		money %= 100;
		
		osipCnt = money / 50;
		money %= 50;
		
		sipCnt = money / 10;
		money %= 10;
	}
            
	
	
	
	//저장된 지폐와 동전의 개수를 출력하는 메소드
	//출력 형식: 오만원: 1장, 만원: 2장, 오천원: 1장, 천원: 3장, 오백원: 1개, 백원: 4개, 오십원: 1개, 십원: 2개
	public void printMoneyCount() {
		System.out.println("오만원: " + omanCnt + "장, 만원: " + manCnt + "장, 오천원: " + ochCnt + "장, 천원: " + chCnt + "장, 오백원: " + obakCnt + "개, 백원: " + bakCnt + "개, 오십원: " + osipCnt + "개, 십원: " + sipCnt + "개");
		
	
	}
	
}

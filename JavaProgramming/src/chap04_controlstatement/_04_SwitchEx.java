package chap04_controlstatement;

public class _04_SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num =129412;
        
        //switch-case구문으로 num이 3의 배수면 3의 배수입니다. 를 출력하고
        //3의 배수가 아니면 3의 배수가 아닙니다. 를 출력하세요
        //%3 == 0
        switch(num % 3) {
        case 0:
        System.out.println("3의 배수입니다");
        break;
        default:
        System.out.println("3의 배수가 아닙니다");
        }
        } 

}

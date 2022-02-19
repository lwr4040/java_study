package ifelse;

public class Test05 {

	public static void main(String[] args) {
//		주사위를 2개 던지는 코드를 구현하시고
//		두개의 주사위 합계에 따라 아래와 같이 코드를 구현
//
//		(1) 합계가 짝수일 경우		짝! 출력
//		(2) 합계가 홀수일 경우		홀! 출력
//		(3) 두 주사위가 같은 값일 경우 		더블! 출력
		int rand1 = (int)(Math.random() * 6)+1;
		int rand2 = (int)(Math.random() * 6)+1;
		
		int tot = rand1 + rand2;
		System.out.println(rand1+" "+rand2);
		if(rand1 == rand2) {
			System.out.println("더블 !");
		}
		else if(tot % 2 == 0) {
			System.out.println("짝수 !");
		}
		else {
			System.out.println("홀 !");
		}

	}

}

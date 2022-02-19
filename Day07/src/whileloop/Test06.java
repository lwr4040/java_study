package whileloop;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		//사용자가 틀릴 때까지 구구단 문제를 출제하는 프로그램 구현
		//		(2 x 1 부터 19 x 9까지 구현)
		//
		//사용자가 3문제를 틀리면 게임오버! 라는 메세지를 출력한 뒤 종료
		//종료 전에 정답 개수와 점수를 출력
		//
		//[1] 일반 정답 +10점
		//[2] 어려운 문제 정답은 5점 추가 (총 15점)		11단부터~
		Scanner sc = new Scanner(System.in);
		int cnt = 0;//정답개수
		int over = 0;//틀린개수
		int sum = 0;//점수
		
		while(true) {
			int su1 = (int)(Math.random()* 18)+2;
			int su2 = (int)(Math.random() * 9)+1;
			
			System.out.print(su1 + " x " + su2 +" = ");
			int user = sc.nextInt();
			if(su1 *su2 == user) {
				cnt++;//정답개수 1증가
				sum += 10;//10점씩 더하기
				System.out.println("정답 ! 10점 획득 !");
				if(su1 >= 11) {
					sum += 5;//추가적으로 5점더하기
					System.out.println("어려운문제 ! 추가 5점 획득!");
				}
			}
			else {
				over++;//틀린횟수
				if(over == 3) {
					System.out.println("게임 오버!");
					System.out.println("정답개수 : "+cnt+"\t총 점수 : "+sum);
					break;
				}
				System.out.println("오답입니다 ! 틀린 횟수는 "+over+"회 입니다");
			}
		}

	}

}

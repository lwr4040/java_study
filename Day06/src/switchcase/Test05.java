package switchcase;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		//국어, 영어, 수학점수입력 받은 후
		//평균 double
		//100~90점대면 학점 A
		//80점대면 학점 B
		//70점대면 학점 C
		//60점대면 학점 D
		//그 외 모든 점수 F
		
		//switch 쓸때 cast하기
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 입력 :");
		int kor = sc.nextInt();
		System.out.print("영어 입력 :");
		int eng = sc.nextInt();
		System.out.print("수학 입력 :");
		int math = sc.nextInt();
		int tot = kor + eng + math;
		double avg = tot / 3.0;
		
		switch((int)avg / 10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;
		case 8:
			System.out.println("B학점");
			break;
		case 7:
			System.out.println("C학점");
			break;
		case 6:
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}

	}

}

package input;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제 1 ) 계산기
		//더하기, 빼기, 곱하기, 나누기(정수,실수) , 나머지
		//숫자 2개를 입력받은 후 계산하여 출력
		System.out.print("숫자 1 입력 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 입력 :");
		int num2 = sc.nextInt();
		int plus = num1 + num2;//더하기
		int sub = num1 - num2;//빼기
		int mul = num1 * num2;//곱하기
		int div1 = num1 / num2;//몫
		double div2 = num1 / (double)num2;//나누기(실수)
		int rem = num1 % num2;//나머지
		System.out.println("더하기 : "+plus);
		System.out.println("빼기 : "+sub);
		System.out.println("곱하기 : "+mul);
		System.out.println("나누기(몫) : "+div1);
		System.out.println("나누기(실수) : "+div2);
		System.out.println("나머지 : "+rem);
		
		// 문제 2) 숫자 1개를 입력받아, 홀수이면 true 출력
		System.out.print("정수 입력 :");
		int num = sc.nextInt();
		System.out.println(num % 2 == 1);
		System.out.println(num % 2 != 0);
		
		// 문제 3) 성적 2개를 입력받아 평균 점수가 60점 이상이면 true출력
		System.out.print("성적 입력 :");
		int score1 = sc.nextInt();
		System.out.print("성적 입력 :");
		int score2 = sc.nextInt();
		int tot = score1 + score2;
		double avg = tot / 2.0;
		System.out.println(avg >= 60);
	}

}

package ifelse;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//성적검사 ( 성적 한개 입력 )
		//100~90사이이면 학점 A
		//89~80사이이면 학점 B
		//79~70사이이면 학점 C
		//69~60사이이면 학점 D
		//그 이외의 모든 점수는 F
		System.out.print("성적 입력 :");
		int score = sc.nextInt();
		//1. 모두 if로 쓰는방식 ( 논리연산자 )
		if(100>=score && score >= 90) {
			System.out.println("A");
		}
		if(90>score && score>=80) {
			System.out.println("B");
		}
		if(80>score && score>=70) {
			System.out.println("C");
		}
		if(70>score && score>=60) {
			System.out.println("D");
		}
		if(60>score) {
			System.out.println("F");
		}
		
		//2. else if의 특징을 사용하는 방식
		if(score>=90 && score <= 100) {
			System.out.println("A");
		}
		else if(score>=80) {
			System.out.println("B");
		}
		else if(score>=70) {
			System.out.println("C");
		}
		else if(score>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		
		//[심화] 점수 3개입력받은 후 평균이
		//100~90사이이면 학점 A
		//89~80사이이면 학점 B
		//79~70사이이면 학점 C
		//69~60사이이면 학점 D
		//그 이외의 모든 점수는 F
		System.out.print("성적 1 입력 :");
		int score1 = sc.nextInt();
		System.out.print("성적 2 입력 :");
		int score2 = sc.nextInt();
		System.out.print("성적 3 입력 :");
		int score3 = sc.nextInt();
		int tot = score1 + score2 + score3;
		double avg = tot / 3.0;
		if(avg<=100 && avg >=90) {
			System.out.println("A");
		}
		else if(avg >= 80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else if(avg >= 60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
	}

}

package ifQize;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 문제) 시험점수3개를 입력받고 학점출력 
		// 조건 1) 3과목의 평균을 가지고 점수를 매긴다.
		// 조건 2) 3과목의 평균이 100~90 ==> A
		// 조건 3) 3과목의 평균이 89~80 ==> B
		// 조건 4) 3과목의 평균이 79~70 ==> C
		// 조건 5) 69이하                      ==> 재시험 
		// 추가조건) 각점수대별로 끝자리가 7점 이상은 + 가붙는다. 
		// 예) 98 ==> A+
		// 예) 89 ==> B+
		// 예) 79 ==> C+
		Scanner sc = new Scanner(System.in);
		System.out.print("성적1 입력 :");
		int score1 = sc.nextInt();
		System.out.print("성적2 입력 :");
		int score2 = sc.nextInt();
		System.out.print("성적3 입력 :");
		int score3 = sc.nextInt();
		int tot = score1+ score2 + score3;
		int avg = tot / 3;
		String grade = null;
		if(avg <= 100 && avg >= 90) {
			grade = "A";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else if(avg >= 80) {
			grade = "B";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else if(avg >= 70) {
			grade = "C";
			if(avg % 10 >= 7) {
				grade+="+";//grade = grade + "+"
			}
		}
		else {
			grade = "재시험";
		}
		System.out.println("등급 : "+grade);
		
		if(avg >= 90 && avg <= 100) {
			if(avg >= 97) {
				System.out.println("A+");
			}
			else {
				System.out.println("A");
			}
		}
		else if(avg >= 80) {
			if(avg >= 87) {
				System.out.println("B+");
			}
			else {
				System.out.println("B");
			}
		}
		else if(avg >= 70) {
			if(avg >= 77) {
				System.out.println("C+");
			}
			else {
				System.out.println("C");
			}
		}
		else {
			System.out.println("재시험");
		}
	}

}

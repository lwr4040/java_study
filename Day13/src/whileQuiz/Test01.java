package whileQuiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * # 쇼핑몰 뒤로가기
		 * 
		 * 문제) 쇼핑몰메인메뉴에서 남성의류를 선택해서 
		 *      뒤로가기 누르기전까지 남성의류 페이지 를 유지할려고한다.
		 * 힌트) 개층 별로 반복문을 추가 해주면된다. 
		 * 1. 남성의류
		 * 		1) 티셔츠
		 * 		2) 바지
		 * 		3) 뒤로가기
		 * 2. 여성의류
		 * 		1) 가디건
		 * 		2) 치마
		 * 		3) 뒤로가기
		 * 3. 종료
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.남성의류");
			System.out.println("2.여성의류");
			System.out.println("3.종료");
			int select = sc.nextInt();
			if(select == 1) {
				while(true) {
					System.out.println("1)티셔츠");
					System.out.println("2)바지");
					System.out.println("3)뒤로가기");
					
					select = sc.nextInt();
					if(select == 1) {
						System.out.println("티셔츠를 선택하셨습니다");
					}
					else if(select == 2) {
						System.out.println("바지를 선택하셨습니다");
					}
					else {
						break;
					}
				}
			}
			else if(select == 2) {
				while(true) {
					System.out.println("1)가디건");
					System.out.println("2)치마");
					System.out.println("3)뒤로가기");
					
					select = sc.nextInt();
					if(select == 1) {
						System.out.println("가디건을 선택하셨습니다");
					}
					else if(select == 2) {
						System.out.println("치마를 선택하셨습니다");
					}
					else {
						break;
					}
				}
			}
			else {
				break;
			}
		}

	}

}

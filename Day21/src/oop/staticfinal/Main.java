package oop.staticfinal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//static final - 상수화 변수
		// - 변수 선언시 사용된다.
		// - 공간의 이름이 있기때문에 다시 불러올 수 있지만 데이터를 변경할 수 없는 공간
		// - 프로그램상에서 의미를 가지고 있고 그 의미가 변경되지 않는 데이터들을 보다 쉽게
		//  구분하여 사용하기 위해서..
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		
		char key = sc.next().charAt(0);
		switch(Character.toLowerCase(key)) {//소문자로 변환
		case Key.SKILL1:
			System.out.println("SKILL1");
			break;
		case Key.SKILL2:
			System.out.println("SKILL2");
			break;
		case Key.SKILL3:
			System.out.println("SKILL3");
			break;
		case Key.SKILL4:
			System.out.println("SKILL4");
			break;
		default:
			System.out.println("잘못된 문자 입력 !");
		}
	}

}

package api.lang.string;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		// 회원가입 로그인 문제

		// 1.회원가입
		// String으로 회원가입 - 아이디, 비밀번호

		// 2.로그인
		// 회원가입한 아이디 비밀번호랑 일치하면은 로그인 성공 ! 일치하지않으면 로그인 실패 !

		// 3.종료
		// 반복문 종료
		String dbId = null;
		String dbPw = null;
		
		String id = null;
		String pw = null;
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("1.회원가입 2.로그인 3.종료\n입력 :");
			int num = sc.nextInt();
			if(num == 1) {
				System.out.print("아이디 입력 :");
				dbId = sc.next();
				System.out.print("비밀번호 입력 :");
				dbPw = sc.next();
				System.out.println("회원가입 완료 !");
			}
			else if(num == 2) {
				System.out.print("아이디 입력 :");
				id = sc.next();
				System.out.print("비밀번호 입력 :");
				pw = sc.next();
				if(id.equals(dbId) && pw.equals(dbPw)) {
					System.out.println("로그인 성공 !");
				}
				else {
					System.out.println("로그인 실패 !");
				}
			}
			else {
				System.out.println("종료합니다");
				break;
			}
		}
	}

}

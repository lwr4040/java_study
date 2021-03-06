package api.io.string;

import java.io.*;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * 사용자에게 아이디와 비밀번호를 입력받고 이를 member.txt에 
		 * 아래와 같은 형식으로 저장하려고 합니다
		 * (예) 아이디 : admin
		 * 비밀번호 : 1234 
		 * 등록 성공
		 * 아이디 : test
		 * 비밀번호 : 2345 
		 * 등록 성공
		 * ====member.txt====
		 *  admin/1234
		 *  test/2345
		 */	
		//printer.flush();//내가 입력한것을 close하지 않아도 바로
		//메모장에 들어가게 해주는 메소드
		File target = new File("files","member.txt");
		Scanner sc = new Scanner(System.in);
		try {
			Writer out = new FileWriter(target);
			PrintWriter printer = new PrintWriter(out);
			while(true) {
				System.out.println("id : ");
				String id = sc.next();
				System.out.println("pw : ");
				String pw = sc.next();
				printer.println(id+"/"+pw);
				printer.flush();
				System.out.println("등록 완료 !");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}

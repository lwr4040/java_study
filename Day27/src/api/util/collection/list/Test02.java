package api.util.collection.list;

import java.util.*;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		[도서 등록 프로그램 구현]
//		사용자에게 계속해서 도서명을 입력받아 저장하는 저장소를 구현하려고 합니다
//		이미 등록된 책이면 등록이 거절되었으면 합니다
//		(예상 결과)	
//		도서명 : 어린 왕자
//		도서 등록이 되었습니다... 현재 도서 1개
//		도서명 : 키다리 아저씨
//		도서 등록이 되었습니다... 현재 도서 2개
//		도서명 : 어린 왕자
//		이미 등록된 도서입니다.
//		도서명 : 종료
//		프로그램을 종료합니다.
//	    1.도서등록   2.도서삭제    3.도서검색
		Scanner sc = new Scanner(System.in);
		List<String> book = new ArrayList<>();
		while(true) {
			System.out.print("1.도서등록    2.도서삭제    3.도서검색\n입력 :");
			int select = sc.nextInt();
			sc.nextLine();//enter값 제거 ( buffer 비우기 )
			if(select == 1) {
				System.out.print("추가하실 도서 :");
				String name = sc.nextLine();
				if(book.contains(name)) {
					System.out.println("이미 등록된 도서입니다");
				}
				else if(name.equals("종료")) {
					System.out.println("프로그램을 종료합니다");
					break;
				}
				else {
					book.add(name);
					System.out.println("도서 등록이 완료되었습니다..현재 도서 "+book.size()+"개입니다..");
				}
			}
			else if(select == 2) {
				System.out.print("삭제 하실 도서 : ");
				String name = sc.nextLine();
				if(book.contains(name)) {
					book.remove(name);
					System.out.println("정상적으로 삭제되었습니다");
				}
				else {
					System.out.println("삭제하실 도서가 없습니다");
				}
			}
			else if(select == 3) {
				System.out.print("검색하실 도서 입력 :");
				String name = sc.nextLine();
				if(book.contains(name)) {
					System.out.println(name+"도서는 "+(book.indexOf(name)+1)+"번째 있습니다");
				}
				else {
					System.out.println("찾으시는 도서가 없습니다");
				}
			}
			else {
				System.out.println("잘못된 번호 입력 !");
			}
		}
	}

}

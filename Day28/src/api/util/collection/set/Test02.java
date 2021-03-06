package api.util.collection.set;

import java.util.*;

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
		Set<String> set =new HashSet<>();
		Scanner sc = new Scanner(System.in);
		//1.도서등록	2.도서삭제	3.도서보기  4.종료
		while(true) {
			boolean check = true;
			String book = null;
			Iterator<String> it= null;
			System.out.print("1.도서등록 2.도서삭제 3.도서보기 4.종료");
			int select = sc.nextInt();
			sc.nextLine();
			if(select == 1) {
				System.out.print("도서 입력 :");
				book = sc.nextLine();
				if(set.contains(book)) {
					System.out.println("이미 존재하는 도서입니다");
				}
				else {
					set.add(book);
					System.out.println("도서 등록이 되었습니다.. 현재 도서는 "+set.size()+"개입니다");
				}
			}
			else if(select == 2) {
				System.out.print("책 이름 :");
				book = sc.nextLine();
				it = set.iterator();
				while(it.hasNext()) {
					String bk= it.next();
					if(bk.equals(book)) {
						it.remove();
						System.out.println(book+"책이 삭제되었습니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("책 이름을 찾지 못했습니다");
				}
			}
			else if(select == 3) {
				for(String bk : set) {
					System.out.println(bk);
				}
			}
			else if(select == 4) {
				break;
			}
		}
	}

}

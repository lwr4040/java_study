package api.util.collection.map;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// 전화번호 이름 을 저장하고 관리 Map으로 관리하기...
		// 데이터 추가 , 삭제 , 수정 , 보기
		//이름이 중복 가능 , 전화번호가 중복 불가능
		Map<String,String> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			String name = null;
			String tel = null;
			System.out.print("1.추가 2.삭제 3.수정 4.보기\n입력 :");
			int n = sc.nextInt();
			switch(n) {
			case 1:
				System.out.print("이름 입력 :");
				name = sc.next();
				System.out.print("전화번호 입력 :");
				tel = sc.next();
				if(map.containsKey(tel)) {
					System.out.println(tel+"번호는 이미 존재합니다");
				}
				else {
					map.put(tel, name);
					System.out.println(name+"님의 정보가 추가되었습니다");
				}
				break;
			case 2:
				System.out.print("번호 입력 :");
				tel = sc.next();
				
				if(map.remove(tel) != null) {
					System.out.println(tel+"번호가 삭제되었습니다");
				}
				else {
					System.out.println(tel+"번호가 존재하지않습니다");
				}
				break;
			case 3:
				System.out.print("이름 입력 :");
				name = sc.next();
				System.out.print("번호 입력 :");
				tel = sc.next();
				
				if(map.containsKey(tel)) {
					map.replace(tel, name);
					System.out.println(name+"님의 정보가 수정되었습니다");
				}
				else {
					System.out.println(tel+"번호가 존재하지않습니다");
				}
				break;
			case 4:
				Set<String> set = map.keySet();
				for(String key : set) {
					System.out.println(map.get(key)+" : "+ key);
				}
				break;
			default:
				System.out.println("잘못된 입력 !");
			}
			
			
		}
	}

}

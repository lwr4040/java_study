package api.util.collection.set;

import java.util.*;

public class Test03 {

	public static void main(String[] args) {
		// 이름과 전화번호를 저장할수 있는 클래스를 만들고 set으로 관리하기...
		// 데이터 추가 , 삭제 , 보기
		//단, 같은이름은 추가가 불가능 .. 삭제도 이름이 동일할경우만 삭제
		Set<Info> set = new HashSet<>();
		Scanner sc =new Scanner(System.in);
		while(true) {
			boolean check = true;
			Iterator<Info> it = null;
			String name = null;
			String tel = null;
			System.out.print("1.추가  2.삭제  3.보기  4.종료\n입력 :");
			int select = sc.nextInt();
			if(select == 1) {
				System.out.print("이름 :");
				name = sc.next();
				System.out.print("번호 :");
				tel = sc.next();
				
				for(Info in : set) {
					if(in.getName().equals(name)) {
						System.out.println("같은 이름이 존재합니다");
						check = false;
						break;
					}
				}
				if(check) {
					set.add(new Info(name,tel));
					System.out.println(name+"님의 정보가 추가되었습니다");
				}
			}
			else if(select == 2) {
				System.out.print("이름 입력 :");
				name = sc.next();
				it = set.iterator();
				while(it.hasNext()) {
					Info in = it.next();
					if(in.getName().equals(name)) {
						it.remove();
						System.out.println(name+"님의 정보가 삭제되었습니다");
						check = false;
						break;
					}
				}
				if(check) {
					System.out.println("이름을 찾지 못했습니다");
				}
			}
			else if(select == 3) {
				for(Info in: set) {
					in.disp();
				}
			}
			else if(select == 4) {
				break;
			}
			else {
				System.out.println("잘못된 번호 입력 !");
			}
		}
	}

}

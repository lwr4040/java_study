package api.util.collection.map;

import java.util.Map;
import java.util.*;

public class Test02 {

	public static void main(String[] args) {
		/*
		슈퍼마켓 상품 등록 프로그램
		아래의 형태가 구현되도록 Map을 이용해 프로그래밍하세요
		(예)	상품이름 : 참이슬
			상품가격 : 1200
			상품등록이 완료되었습니다... 현재 상품 1개가 등록되어 있습니다.
			상품이름 : 허니버터칩
			상품가격 : 2000
			상품등록이 완료되었습니다... 현재 상품 2개가 등록되어 있습니다.
			상품이름 : 참이슬
			상품가격 : 1500
			이미 등록된 상품입니다. 가격을 변경하시겠습니까?(Y/N)	Y
			(Y)가격 변경이 완료되었습니다	/	(N)등록이 취소되었습니다
		 */
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> mart = new HashMap<String,Integer>();
		while(true) {
			System.out.print("상품 이름 :");
			String name = sc.next();
			System.out.print("상품 가격 :");
			int price = sc.nextInt();
			
			if(mart.containsKey(name)) {
				System.out.println("이미 등록된 상품입니다..\n가격을 변경하시겠습니까?(Y/N)");
				char select = sc.next().charAt(0);
				//String select = sc.next();
				//select.toLowerCase().equals("y")
				if(select == 'Y' || select == 'y') {
					Integer origin = mart.get(name);
					//mart.put(name,price);
					mart.replace(name,price);
					System.out.println(name+"상품의 가격이 "+origin+"원에서 "+price+"원으로 수정되었습니다");
					
				}
				else {
					System.out.println("상품 등록이 취소되었습니다");
				}
			}
			else {
				mart.put(name, price);
				System.out.println("상품 등록이 완료되었습니다..현재 등록 상품 "+mart.size()+"개");
			}
		}
	}

}

package api.util.collection.list;

import java.util.*;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * [문제] 사다리 게임 만들기
			아래와 같은 형식이 되도록 사다리 추첨 게임을 구현하세요
			(예상 결과)	인원수 : 3
			이름1 : A
			이름2 : B
			이름3 : C
			항목1 : 1
			항목2 : 2
			항목3 : 3
			추첨 결과는 다음과 같습니다
			A → 3
			B → 1
			C → 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 :");
		int su = sc.nextInt();
		sc.nextLine();
		List<String> ls1 = new ArrayList<>(su);//원하는 개수까지 list생성
		List<String> ls2 = new ArrayList<>(su);
		
		for(int i=0;i<su;i++) {
			System.out.println("이름 "+(i+1)+":");
			ls1.add(sc.nextLine());
		}
		for(int i=0;i<su;i++) {
			System.out.println("항목 "+(i+1)+":");
			ls2.add(sc.nextLine());
		}
		Collections.shuffle(ls2);
		for(int i=0;i<su;i++) {
			System.out.println(ls1.get(i)+" -> "+ls2.get(i));
		}
	}

}

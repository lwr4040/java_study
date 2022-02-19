package api.util.scanner;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		//Scanner		텍스트(text)를 읽는 도구. 문자열, 파일, URL , 키보드 등이 될 수 있다.
		
		String song = "동해물과 백두산이 마르고닳도록\n하느님이 보우하사 우리나라만세";
		
		Scanner s1 = new Scanner(song);
		while(s1.hasNext()) {
			System.out.println(s1.hasNext());//남은 단어가 있는지
			System.out.println(s1.next());//남은 단어를 가져온다.
		}
		s1.close();
		System.out.println("-------------------------");
		Scanner s2 = new Scanner(song);
		while(s2.hasNextLine()) {
			System.out.println(s2.hasNextLine());//남은 문장이 있는지
			System.out.println(s2.nextLine());//남은 문장을 가져온다.
		}
		s2.close();
	}

}

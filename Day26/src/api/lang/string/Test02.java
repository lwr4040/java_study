package api.lang.string;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
//		쿵쿵따 게임
//		(규칙)	
//		[1] 사용자에게 계속해서 단어를 입력받습니다
//		[2] 입력된 단어가 3글자가 아니면 게임을 종료합니다
//		[3] 이전 입력된 단어의 마지막 글자와
//		지금 입력한 단어의 첫 글자가 같을 때만 진행, 아니면 종료합니다
//			(예) 바나나 → 나비 (2글자라서 종료)
//				고무공 → 공놀이 → 이니셜 → 설리반 (끝/처음 불일치로 종료)
		String word1 = null;//이전단어
		String word2 = null;//현재단어
		Scanner sc = new Scanner(System.in);
		while(true) {
			//조건1 : 3글자 아니면 게임 종료
			System.out.print("입력 :");
			word1 = word2;//처음 : null 두번째 : 고무공 세번째 : 공놀이
			word2 = sc.next();//현재 단어 입력 처음 : 고무공 두번째 : 공놀이 세번째 : ..
			if(word2.length() != 3) {
				System.out.println("3글자만 가능합니다");
				break;
			}
			//조건 2 : word1의 마지막글자와 word2의 첫글자가 같을것
			else if(word1 != null) {//첫번째 실행x
				char a = word1.charAt(2);
				char b = word2.charAt(0);
				if(a != b) {
					System.out.println("규칙 위반 ! 끝글자와 첫글자가 같아야합니다");
					break;
				}
			}
			System.out.println("word1 = "+word1+" word2 = "+word2);
		}
	}

}

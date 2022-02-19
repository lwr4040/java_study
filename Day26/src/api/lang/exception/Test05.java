package api.lang.exception;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
//		예외 처리를 이용하여 아래의 내용을 구현하세요
//
//		사용자에게 닉네임을 입력받도록 하겠습니다
//
//		아래의 2가지 조건에 어긋날 경우 오류 출력
//		[1] 3~10글자를 벗어나는 경우
//		→ 3~10글자 이내로 작성하세요

//		[2] 운영자라는 단어가 포함된 경우
//		→ 운영자라는 단어는 포함시킬 수 없습니다

		// 블랙리스트검사
		String[] blacklist = new String[] { "바보", "멍청이", "새끼" };
		Scanner sc = new Scanner(System.in);
		String nick = null;
		while(true) {
			try {
				System.out.print("닉네임 입력 :");
				nick = sc.next();
				if(nick.length() < 3 || nick.length() > 10) {
					throw new Exception("3~10글자 이내로 작성하세요");
				}
				else if(nick.indexOf("운영자") != -1) { // >= 0
					//포함되어있으면 인덱스 번호를 반환.. 없으면 -1을 반환
					throw new Exception("운영자라는 단어를 포함 시킬 수 없습니다");
				}
				//블랙리스크 검사
				for(int i=0;i<blacklist.length;i++) {
					if(nick.indexOf(blacklist[i])>=0) {
						throw new Exception("블랙리스트 된 단어입니다");
					}
				}
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

package oop.inher03;

public class Main {

	public static void main(String[] args) {
//		(아래의 객체를 생성한 뒤 정보 출력)
//		name	telecom	price	card	month
//	[1]	아이폰7	KT		90만원	국민카드	24개월
//	[2]	갤럭시7	SK		30만원	신한카드	30개월
//	[3]	G6		LG		35만원	삼성카드	36개월
		MobileEx[] m = new MobileEx[] {
				new MobileEx("아이폰7","KT",90,"국민카드",24),
				new MobileEx("갤럭시7","SK",30,"신한카드",30),
				new MobileEx("G6","LG",35,"삼성카드",36)
		};
		for(int i=0;i<m.length;i++) {
			m[i].disp(i+1);
		}
	}
}

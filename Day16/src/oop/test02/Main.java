package oop.test02;

public class Main {

	public static void main(String[] args) {
//		아래의 항목을 만드시고 정보 출력
//		id	
//	[1]	공유			레벨 20으로 변경 후 정보 출력
//	[2]	아이유		레벨 15로 변경 후 정보 출력
//	[3]	유인나		레벨 30으로 변경 후 정보 출력	
		
		Player p1 = new Player("공유");
		Player p2 = new Player("아이유");
		Player p3 = new Player("유인나");
		
		p1.setLev(20);
		p1.setLev(15);
		p1.setLev(25);
		p2.setLev(15);
		p3.setLev(30);
		
		p1.disp();
		p2.disp();
		p3.disp();

	}

}

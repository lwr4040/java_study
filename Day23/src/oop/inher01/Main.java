package oop.inher01;

public class Main {

	public static void main(String[] args) {
//		(합계, 평균 등이 제대로 나오도록 아래의 객체를 생성 후 정보 출력)
		//		name	java	c	python  합계  평균
		//[1] 	엑스맨	80		85	90
		//[2] 	배트맨	90		85	80
		//[3] 	슈퍼맨	100		20	25
		
		StudentEx[] st = new StudentEx[] {
				new StudentEx("엑스맨",80,85,90),
				new StudentEx("배트맨",90,85,80),
				new StudentEx("슈퍼맨",100,20,25)
		};
		for(int i=0;i<st.length;i++) {
			st[i].disp(i+1);
		}
	}

}

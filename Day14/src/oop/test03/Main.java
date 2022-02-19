package oop.test03;

public class Main {

	public static void main(String[] args) {
		//이름,나이,국어성적,영어성적,수학성적,총점,평균
		
		//이름 : 홍길동
		//나이 : 20
		//국어성적 : 89
		//영어성적 : 77
		//수학성적 : 21
		//총점 : 187
		//평균 : 62...(실수)
		
		//두명의 학생의 이름과 성적 저장
		Info in1 = new Info();
		in1.setData("홍길동", 20, 89, 77, 21);
		//in1.setTot();
		//in1.setAvg();
		in1.disp();
		
		Info in2 = new Info();
		in2.setData("이몽룡", 30, 80, 44, 27);
		in2.disp();
		
		Info in3 = new Info();
		in3.setData("거북이", 48, 77, 80, 100);
		in3.disp();
		//가장 높은 평균 점수를 가진 학생의 이름을 출력
		double max_avg = 0;
		String name = null;
		max_avg = in1.getAvg();
		if(max_avg < in2.getAvg()) {
			max_avg = in2.getAvg();
			name = in2.getName();
		}
		if(max_avg< in3.getAvg()) {
			max_avg = in3.getAvg();
			name = in3.getName();
		}
		System.out.println(name);
	}

}

package oop.inner02;

public class Person {
	// 정보 : 이름,나이 Person
	// 성적과 신체 정보를 저장하고 관리할수 있게 하는 프로그램
	// 성적 중첩 클래스 1 ( 국어점수 , 수학점수 , 영어점수 , 총점 , 평균 ) 일반중첩클래스
	// 신체 중첩 클래스 2 (키 , 몸무게 ) 일반중첩클래스
	// 멤버변수는 private
	private String name;
	private int age;
	private Score sc;
	private Physical ph;
	
	public Person(String name,int age,int kor,int eng,int math,double hei,double wei) {
		this.name = name;
		this.age = age;
		sc = new Score(kor,eng,math);
		ph = new Physical(hei,wei);
	}
	public void setName(String name) {//person
		this.name = name;
	}
	public void setAge(int age) {//person
		this.age = age;
	}
	public String getName() {//person
		return name;
	}
	public int getAge() {//person
		return age;
	}
	public void disp() {//person
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		sc.disp();
		ph.disp();
	}
	
	public class Score{
		private int kor,eng,math,tot;
		private double avg;
		public Score(int kor, int eng, int math) {
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.setTot();
			this.setAvg();
		}
		public void setKor(int kor) {//score
			this.kor =kor;
			this.setTot();
			this.setAvg();
		}
		public void setEng(int eng) {//score
			this.eng = eng;
			this.setTot();
			this.setAvg();
		}
		public void setMath(int math) {//score
			this.math = math;
			this.setTot();
			this.setAvg();
		}
		public void setTot() {//score
			this.tot = kor + eng+ math;
		}
		public void setAvg() {//score
			this.avg = tot / 3.0;
		}
		
		public int getKor() {//score
			return kor;
		}
		public int getEng() {//score
			return eng;
		}
		public int getMath() {//score
			return math;
		}
		public int getTot() {//score
			return tot;
		}
		public double getAvg() {//score
			return avg;
		}
		public void disp() {//score
			System.out.println("국어점수 : "+kor+"점");
			System.out.println("영어점수 : "+eng+"점");
			System.out.println("수학점수 : "+math+"점");
			System.out.println("총점 : "+tot+"점");
			System.out.println("평균 : "+avg+"점");
		}
	}
	
	public class Physical{
		private double hei,wei;
		
		public Physical(double hei,double wei) {
			this.hei = hei;
			this.wei = wei;
		}
		public void setHei(double hei) {//physical
			this.hei = hei;
		}
		public void setWei(double wei) {//physical
			this.wei= wei;
		}
		public double getHei() {//physical
			return hei;
		}
		public double getWei() {//physical
			return wei;
		}
		public void disp() {//physical
			System.out.println("키 : "+hei+"cm");
			System.out.println("몸무게 : "+wei+"kg");
		}
		
	}

}

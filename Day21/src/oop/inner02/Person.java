package oop.inner02;

public class Person {
	// ���� : �̸�,���� Person
	// ������ ��ü ������ �����ϰ� �����Ҽ� �ְ� �ϴ� ���α׷�
	// ���� ��ø Ŭ���� 1 ( �������� , �������� , �������� , ���� , ��� ) �Ϲ���øŬ����
	// ��ü ��ø Ŭ���� 2 (Ű , ������ ) �Ϲ���øŬ����
	// ��������� private
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
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
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
			System.out.println("�������� : "+kor+"��");
			System.out.println("�������� : "+eng+"��");
			System.out.println("�������� : "+math+"��");
			System.out.println("���� : "+tot+"��");
			System.out.println("��� : "+avg+"��");
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
			System.out.println("Ű : "+hei+"cm");
			System.out.println("������ : "+wei+"kg");
		}
		
	}

}

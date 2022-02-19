package oop.inner03;

public class Diagram {
	//Diagram - ������ ���α��̿� ���α��� ����
	// - Triangle - �ﰢ���� ���̸� ���ϴ� Ŭ����
	// - Square - �簢���� ���̸� ���ϴ� Ŭ����
	// - Circle -���� ���̸� ���ϴ� Ŭ����..
	private int garo,sero;
	private Triangle t;
	private Square s;
	private Circle c;
	
	public Diagram(int garo,int sero) {
		this.garo = garo;
		this.sero = sero;
		t = new Triangle(garo,sero);
		s = new Square(garo,sero);
		c = new Circle(garo);
	}
	
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getGaro() {
		return garo;
	}
	public int getSero() {
		return sero;
	}
	public void disp() {
		System.out.println("���α��� : "+garo+"\t���α��� : "+sero);
		t.disp();
		s.disp();
		c.disp();
	}
	
	public class Triangle{
		private double area;//�ﰢ�� ���̸� �����ϴ� �������
		
		public Triangle(int garo, int sero) {//Triangle
			this.setArea(garo, sero);
		}
		public void setArea(int garo,int sero) {//Triangle
			this.area = garo * sero / 2.0;
		}
		public double getArea() {//Triangle
			return area;
		}
		public void disp() {//Triangle
			System.out.println("�ﰢ���� ���� : "+this.area);
		}
	}
	public class Square{
		private int area;//�簢�� ����
		
		public Square(int garo,int sero) {//Square
			this.setArea(garo, sero);
		}
		public void setArea(int garo,int sero) {//Square
			this.area = garo * sero;
		}
		public int getArea() {//Square
			return area;
		}
		public void disp() {//Square
			System.out.println("�簢���� ���� : "+this.area);
		}
	}
	public class Circle{
		
		private double area;//���� ����
		public Circle(int garo) {//Circle
			this.setArea(garo);
		}
		public void setArea(int garo) {//Circle
			this.area = (garo / 2) * (garo /2) * Math.PI;
		}
		public double getArea() {//Circle
			return area;
		}
		public void disp() {//Circle
			System.out.println("���� ���� : "+area);
		}
	}
}

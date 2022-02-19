package oop.inner03;

public class Diagram {
	//Diagram - 도형의 가로길이와 세로길이 관리
	// - Triangle - 삼각형의 넓이를 구하는 클래스
	// - Square - 사각형의 넓이를 구하는 클래스
	// - Circle -원의 넓이를 구하는 클래스..
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
		System.out.println("가로길이 : "+garo+"\t세로길이 : "+sero);
		t.disp();
		s.disp();
		c.disp();
	}
	
	public class Triangle{
		private double area;//삼각형 넓이를 저장하는 멤버변수
		
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
			System.out.println("삼각형의 넓이 : "+this.area);
		}
	}
	public class Square{
		private int area;//사각형 넓이
		
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
			System.out.println("사각형의 넓이 : "+this.area);
		}
	}
	public class Circle{
		
		private double area;//원의 넓이
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
			System.out.println("원의 넓이 : "+area);
		}
	}
}

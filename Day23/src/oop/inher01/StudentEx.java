package oop.inher01;

public class StudentEx extends Student{
//	저희 학원은 자바, C언어만 강의를 하고 있었습니다. 
//	장사가 너무 잘되서 파이썬 과목을 추가하기로 결정하였고 
//	관리 프로그램 클래스도 개량하여 사용하기로 하였습니다.	
//	(StudentEx 클래스)
//	(추가된 항목)
//	파이썬(python)	파이썬 과목 점수
	private int python;
	
	public StudentEx(String name,int java,int c,int python) {
		super(name,java,c);
		this.python = python;
		this.setTot();
		this.setAvg1();
	}
	
	protected void setTot() {//재정의 ( 자식객체로 만들기때문에 부모메소드보다 자식메소드가 우선순위 )
		super.tot =super.getJava() + super.getC() + this.python;
	}
	
	protected void setAvg1() {//메소드명을 다르게할때는 상관 x
		super.avg = super.tot / 3.0;
	}
	
	public void setPython(int python) {
		this.python = python;
		this.setTot();
		this.setAvg1();
	}
	
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	public int getPython() {
		return python;
	}
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+super.getName()+"\t"+super.getJava()
		+"\t"+super.getC()+"\t"+python+"\t"+super.tot+"\t"+super.avg);
	}
	
}

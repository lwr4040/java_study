package oop.inher01;

public class Student {
	private String name;
	private int java,c;
	protected int tot;// - 자식에서도 접근이 가능할 수 있도록 ( 부모와 자식이 같이 사용하는 변수 )
	protected double avg;
	
	public Student(String name,int java,int c) {
		this.name = name;
		this.java = java;
		this.c = c;
		setTot();
		setAvg();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setJava(int java) {
		this.java = java;
		setTot();
		setAvg();
	}
	public void setC(int c) {
		this.c = c;
		setTot();
		setAvg();
	}
	protected void setTot() {
		this.tot = java + c;
	}
	protected void setAvg() {
		this.avg = this.tot / 2.0;//java , c 두과목 
	}
	
	public String getName() {
		return name;
	}
	public int getJava() {
		return java;
	}
	public int getC() {
		return c;
	}
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+name+"\t"+java+"\t"+c+"\t"+tot+"\t"+avg);
	}
}

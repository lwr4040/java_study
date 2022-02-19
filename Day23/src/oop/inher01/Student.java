package oop.inher01;

public class Student {
	private String name;
	private int java,c;
	protected int tot;// - �ڽĿ����� ������ ������ �� �ֵ��� ( �θ�� �ڽ��� ���� ����ϴ� ���� )
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
		this.avg = this.tot / 2.0;//java , c �ΰ��� 
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

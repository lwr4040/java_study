package oop.inher01;

public class StudentEx extends Student{
//	���� �п��� �ڹ�, C�� ���Ǹ� �ϰ� �־����ϴ�. 
//	��簡 �ʹ� �ߵǼ� ���̽� ������ �߰��ϱ�� �����Ͽ��� 
//	���� ���α׷� Ŭ������ �����Ͽ� ����ϱ�� �Ͽ����ϴ�.	
//	(StudentEx Ŭ����)
//	(�߰��� �׸�)
//	���̽�(python)	���̽� ���� ����
	private int python;
	
	public StudentEx(String name,int java,int c,int python) {
		super(name,java,c);
		this.python = python;
		this.setTot();
		this.setAvg1();
	}
	
	protected void setTot() {//������ ( �ڽİ�ü�� ����⶧���� �θ�޼ҵ庸�� �ڽĸ޼ҵ尡 �켱���� )
		super.tot =super.getJava() + super.getC() + this.python;
	}
	
	protected void setAvg1() {//�޼ҵ���� �ٸ����Ҷ��� ��� x
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

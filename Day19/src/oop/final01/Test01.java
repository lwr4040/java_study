package oop.final01;

public class Test01 {
	
	//final�� �ٿ� ������ ������ ������ �ȿ��� �ʱ�ȭ�� �������־���Ѵ�.
	
	final int a;
	
	public Test01(int a) {
		this.a = a;
	}
	
	final void disp(int i) {//�����ε� : ���� �޼ҵ������ �Ű������� �ٸ����Ͽ� ����°�
		System.out.println(i+"disp");
	}
	
	final void disp() {
		System.out.println("disp");
	}

	public static void main(String[] args) {
		// ������ - ��� ���� , �Ǵ� ������ �߻���Ű�� Ű����..
		
		//final - ��������, ������..
		// - �̰��� �������̴�..
		// - �缳�� ����
		
		//���� - �ѹ� ���� �����ϸ� �� ���� �������� ���� �ȴ�.. ������ ���� �Ұ���..
		
		// - �޼ҵ� - �������̵� ����.. �޼ҵ� ������ ���� (����̶� ����)
		//Ŭ���� - ��ӱ���
		
		final int a;
		a = 20;
		System.out.println("a = "+a);
		//a = 10; - �����ͺ��� �Ұ���
		Test01 t = new Test01(10);
		System.out.println(t.a);
		//t.a = 30; - ������ ���� �Ұ���
		t.disp();
		t.disp(1);
	}

}

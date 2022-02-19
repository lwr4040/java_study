package oop.poly03;
//�߻�Ŭ����
// - abstract�� �ٿ��� ������ Ŭ����
// - �߻�޼ҵ带 ������ �ִ� Ŭ����.. X
// - �θ��� ��Ȱ�� �����ϱ� ���� ��������� Ŭ����
// - �Ϲ������� ��ü ���� �Ұ�.. �͸� ��øŬ������ ���� �ӽ������� ��ü ���� ����
// - �ڽ� Ŭ�������� �߻�޼ҵ带 �������̵� ���־���Ѵ�.
//   �߻�޼ҵ带 �������̵����� ������ �ڽ� Ŭ������ �߻�Ŭ������ �������Ѵ�.

public abstract class Animal {
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void disp() {
		System.out.println("�̸� : "+name);
	}
	
	//�߻�޼ҵ� - �󲮵��� �޼ҵ�
	// - �������� ���ؼ� �θ�Ŭ������ �����ϴ� �޼ҵ�
	// - �θ�Ŭ���������� ������ ������ �������� ������ �������� ���ؼ� �����Ѵ�.
	// - abstract�� �ٿ��� �����Ѵ�.
	public abstract void bark();
	public abstract void eat();
}

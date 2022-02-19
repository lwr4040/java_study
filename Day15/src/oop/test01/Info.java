package oop.test01;

public class Info {
	//�̸�,����
	//�������
	private String name; // �ܺο��� ���� �Ұ� ( ��, Ŭ���������� ���� ���� )
	private int age;
	
	//this
	// - �ڱ� �ڽ��� ȣ���� ��ü�� ������ ������ ������ ����
	// - �޼ҵ尡 ȣ��ɶ� �ڵ����� ���������.
	// - �޼ҵ� �ܺο����� ��� �Ұ��� **
	// - Ŭ������ ����� ȣ���Ҷ� this **
	
	// - ����
	//  	Ŭ������ this;
	//		this.Ŭ�������;
	
	//����޼ҵ�(setData,disp)
	public void setData(String name,int age) {
		this.name = name;
		this.setAge(age);
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			System.out.println("���̸� �߸��Է��ϼ̽��ϴ�");
			this.age = 1;
			return;//�޼ҵ� ����
		}
		this.age = age;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("�̸� : "+this.getName());
		System.out.println("���� : "+age);
	}
}

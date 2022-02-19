package oop.inher02;

public class Info {
	//������� - ����,�̸�
	//������ - ����Ʈ������, �̸�������, ���� �̸� ������
	//����޼ҵ� - setter, getter , disp
	private String name;
	private int age;
	public Info() {
		System.out.println("�θ� ����Ʈ ������ ���� !");
	}
	
	public Info(String name) {
		this.name = name;
		this.age = 1;
		System.out.println("�θ� �̸� ������ ���� !");
	}
	
	public Info(String name,int age) {
		this.name = name;
		this.setAge(age);
		System.out.println("�θ� �̸� ���� ������ ���� !");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		if(age < 1) {
			this.age = 1;
			return;
		}
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void disp() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}

package oop.poly04;
//extends - Ŭ���� ��� Ű����.. Ŭ������ �߻�Ŭ���� ��Ʋ�� �� �ϳ��� ��ӹ��� �� �ִ�.

//CPP���� ���߻���� ���������� �����ߴ�..
// - �޼ҵ��� ��ħ
// - �θ��� ��ħ

//JAVA������ ���߻���� �������� �����Ͽ���.
// - �������̽��� ���Ͽ� �������� ��� ���� �� �ִ�.
// - implements - �������̽� ���� ��� Ű����.. �������̽��� ������ ��� ����..

public class Cat extends Animal implements Bark,Eat{

	public Cat(String name) {
		super(name);
	}

	@Override
	public void bark() {
		System.out.println("�߿�");
	}

	
	public void eat() {
		System.out.println("����");
	}

	

}

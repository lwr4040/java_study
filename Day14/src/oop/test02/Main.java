package oop.test02;

public class Main {

	public static void main(String[] args) {
		//�̸� : ȫ�浿
		//���� : 20
		//���� : 80
		Info in1 = new Info();
		in1.setData("ȫ�浿", 20, 80);
		in1.disp();
		System.out.println(in1.getName());
		//�̸� : �̸���
		//���� : 35
		//���� : 89
		Info in2 = new Info();
		in2.setData("�̸���",35,89);
		in2.disp();
		System.out.println(in2.getName());
		//�̸� : �質��
		//���� : 24
		//���� : 100
		Info in3 = new Info();
		in3.setData("�質��", 24, 100);
		in3.disp();
		System.out.println(in3.getName());
	}

}

package oop.test02;

public class Main {

	public static void main(String[] args) {
		Info in = new Info();
		in.setData("ȫ�浿", 20);
		in.disp();
		
		Info in1 = new Info("ȫ�浿",30);
		in1.disp();
		
		Info in2 = new Info("�̸���"); //�����ڴ� new ��� ��ü ������ �� �ѹ��� ����
		in2.disp();
		
		//Info in3 = new Info(30); <- ���̻����� x
	}

}

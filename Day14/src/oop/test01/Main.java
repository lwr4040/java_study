package oop.test01;

public class Main {

	public static void main(String[] args) {
		Info in = new Info();
		//Scanner sc = new Scanner(System.in);
		//sc : ��ü��
		in.setData("ȫ�浿", 20);//���ڰ� : �Ű������� ���� ������
		in.disp();
		String name = in.getName();
		System.out.println(name);
		
		Info in2 = new Info();
		in2.setData("�̸���", 30);
		in2.disp();
		in.disp();
		

	}

}

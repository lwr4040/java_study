package oop.test03;

public class Main {

	public static void main(String[] args) {
		//�̸�,����,�����,�����,���м���,����,���
		
		//�̸� : ȫ�浿
		//���� : 20
		//����� : 89
		//����� : 77
		//���м��� : 21
		//���� : 187
		//��� : 62...(�Ǽ�)
		
		//�θ��� �л��� �̸��� ���� ����
		Info in1 = new Info();
		in1.setData("ȫ�浿", 20, 89, 77, 21);
		//in1.setTot();
		//in1.setAvg();
		in1.disp();
		
		Info in2 = new Info();
		in2.setData("�̸���", 30, 80, 44, 27);
		in2.disp();
		
		Info in3 = new Info();
		in3.setData("�ź���", 48, 77, 80, 100);
		in3.disp();
		//���� ���� ��� ������ ���� �л��� �̸��� ���
		double max_avg = 0;
		String name = null;
		max_avg = in1.getAvg();
		if(max_avg < in2.getAvg()) {
			max_avg = in2.getAvg();
			name = in2.getName();
		}
		if(max_avg< in3.getAvg()) {
			max_avg = in3.getAvg();
			name = in3.getName();
		}
		System.out.println(name);
	}

}

package oop.inher02;

public class Main {

	public static void main(String[] args) {
		//����� �̿��Ͽ� ���� Ŭ���� ���� ������ ������ ���ۼ�
		//��Ʈ : ��ġ�� ������� ( ����� �̿��ؼ� ���� �������� �̿� )
		
		FountainPen f = new FountainPen();
		f.setAmount(2);//�ҸӴ�,�Ҿƹ���
		System.out.println(f.getAmount());//�ҸӴ� �Ҿƹ��� : Pen
		f.setColor("������");
		System.out.println(f.getColor());//�θ� : Ballpen
		f.refill(3);
		System.out.println(f.getAmount());//�ҸӴ� �Ҿƹ��� : Pen
		
		BallPen b = new BallPen();
		b.setAmount(5);
		System.out.println(b.getAmount());//�θ� : Pen
	}

}

package ifelse;

public class Test05 {

	public static void main(String[] args) {
//		�ֻ����� 2�� ������ �ڵ带 �����Ͻð�
//		�ΰ��� �ֻ��� �հ迡 ���� �Ʒ��� ���� �ڵ带 ����
//
//		(1) �հ谡 ¦���� ���		¦! ���
//		(2) �հ谡 Ȧ���� ���		Ȧ! ���
//		(3) �� �ֻ����� ���� ���� ��� 		����! ���
		int rand1 = (int)(Math.random() * 6)+1;
		int rand2 = (int)(Math.random() * 6)+1;
		
		int tot = rand1 + rand2;
		System.out.println(rand1+" "+rand2);
		if(rand1 == rand2) {
			System.out.println("���� !");
		}
		else if(tot % 2 == 0) {
			System.out.println("¦�� !");
		}
		else {
			System.out.println("Ȧ !");
		}

	}

}

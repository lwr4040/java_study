package api.lang.wrapper;

public class Test02 {

	public static void main(String[] args) {
//		API���� Integer��� Ŭ������ ã������ (int�� wrapper class)
//		API�� ���� ������� ���� �ʿ��ϴٸ� �˻��������� Ȱ���Ͽ� �Ʒ��� ������ ó���ϴ� �ڵ带 ����
//		[1] a�� b��� �̸��� ��ü 2���� ���� 100�̶� ������ ����
		Integer a = new Integer(100);
		Integer b = 100;//auto - boxing
//		[2] ȭ�鿡 a�� b�� ���� ���
		System.out.println(a);
		System.out.println(b);
//		[3] a�� b�� ���� ������ ���Ͽ� ȭ�鿡 ����/�ٸ��ٸ� ���
		if(a.equals(b)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
//		[4] a�� 16������ ��ȯ�Ͽ� ȭ�鿡 ���
		System.out.println(Integer.toHexString(a));//static�޼ҵ�
		
//		[5] b�� 2������ ��ȯ�Ͽ� ȭ�鿡 ���
		System.out.println(Integer.toBinaryString(b));//static�޼ҵ�
//		[6] int�� ���� �� �ִ� ���� ū ���� ȭ�鿡 ���
		System.out.println(Integer.MAX_VALUE);
//		[7] String x = "12321"; String y = "32123"; �̶�� ������ ���� ��
//		x + y �� 1232132123 �� ���ɴϴ�
//		44444�� ���� �� �ֵ��� "������ ��ȯ"�Ͽ� ������ ������
		String x = "12321";//auto - boxing
		String y = "32123";//auto - boxing
		System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
		System.out.println(Integer.valueOf(x)+Integer.valueOf(y));
		//������ �̿���
		System.out.println(new Integer(x) + new Integer(y));
	}

}
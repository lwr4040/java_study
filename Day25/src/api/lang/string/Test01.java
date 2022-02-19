package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String Ŭ����
		// - JAVA���� ���ڿ��� �Ѱ��ϴ� Ŭ����
		// - String�� Byte�� ���� ������ �� ���� ����
		
		String a ="Hello";//auto - boxing : ������� ���Ǹ� ���ؼ� �������.
		String b = new String("Hell0");
		
		char[] chs = new char[] {'H','e','L','L','o'};
		String c = new String(chs);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//���ڿ� ��
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		//��ҹ��ں�ȯ
		System.out.println(a.toUpperCase());//�빮�ڷ� ��ȯ
		System.out.println(a.toLowerCase());//�ҹ��ڷ� ��ȯ
		
		//a�� c�� �������� true�� ���� �� �ֵ���
		//String st = a.toLowerCase();
		//System.out.println(st.equals(c.toLowerCase()));
		System.out.println(a.toLowerCase().equals(c.toLowerCase()));
		System.out.println(a.equalsIgnoreCase(c));//��ҹ��� �������� ��
		System.out.println("-------------------------------");
		
		//���ڿ� �˻�
		String email = "dksrkdms00@naver.com";
		
		//startsWith - ���۹��ڿ��� �´°� ? �� ���ڿ��� �����ϴ°�?
		System.out.println(email.startsWith("d"));
		System.out.println(email.startsWith("dks"));
		System.out.println(email.startsWith("dr"));
		System.out.println(email.startsWith("dksr",3));//���� ������ ��ġ�� �� ���ڿ��� �����ϴ°� ?
		System.out.println(email.startsWith("rk",3));
		
		System.out.println("-------------------------------");
		//endsWith - �� ���ڿ��� ������ ��?
		System.out.println(email.endsWith(".com"));
		System.out.println(email.endsWith(".c"));
		System.out.println("---------------------------------");
		System.out.println(email.indexOf('r'));//�ε�����ȣ
		System.out.println(email.indexOf('r',4));//���° �ε������� Ȯ��
		System.out.println(email.lastIndexOf("r"));//���ڿ� �ڿ������� Ȯ��
		System.out.println(email.lastIndexOf("r",4));//�ڿ������� 4��°�ε��� ����
		System.out.println("---------------------------------");
		//���� ���� - charAt(i)
		System.out.println(email.charAt(1));
		
		//���ڿ� ���� - length()
		System.out.println(email.length());
	}

}
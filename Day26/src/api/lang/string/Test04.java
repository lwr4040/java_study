package api.lang.string;

public class Test04 {

	public static void main(String[] args) {
		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 33��
		String strAge = jumin.substring(0,2);//�̸�
		int intAge = Integer.parseInt(strAge);
		int age = 2022 - (1900 + intAge);
		System.out.println(age+"��");
		
		// ���� 2) ���� ���
		// ���� 2) ����
		char key = jumin.charAt(7);
		if(key == '1' || key == '3') {
			System.out.println("����");
		}
		else if(key == '2' || key == '4') {
			System.out.println("����");
		}
	}

}

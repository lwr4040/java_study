package oop.test01;

//�ڵ��� ����..

// . (��� ���� ������)
// - Ŭ������ ������� ����(ȣ��)�ϴ� ������
// - Ŭ������ ����� ����Ϸ��Ҷ� ����ϴ� ������


public class Info {
	
	//�������
	// - Ŭ������ ����� �������� ������..
	// - ���� �����ϵ��� �����ϸ� �ȴ�.
	String name;
	int age;
	
	void setData(String _name,int _age) {//�����͸� �����ϴ� ��Ȱ�� �ϴ� �޼ҵ�
		name = _name;//�Ű����� -> �������
		age = _age;
	}
	
	void disp() {//��������� �ִ� ������ ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
	
	String getName() {
		return name;//�޼ҵ� -> �޼ҵ� ȣ���� ��ҷ� ���� �����ش�.
	}
	//��� �޼ҵ�
	//�޼ҵ� - �Ѱ����� ����� �����ϰ��� ����� �ڵ��� ����..
	// - ����
	//	��ȯ�ڷ���		�޼ҵ��(�Ű�����)		{ �ڵ����� }
	
	//�޼ҵ�� - �޼ҵ带 ȣ���Ҷ� ����ϴ� �̸�
	// - ù���ڴ� �ҹ��� �޶����� �ܾ��� ù���ڴ� �빮�ڷ� �ۼ��Ѵ�.
	// - �޼ҵ��� ����� ����Ǵ� �ܾ�� �̸��� �����ش�.
	
	//��ȯ �ڷ���
	// - �޼ҵ尡 �����ϰ� ���� ����ɶ� �����ִ� ���� ���¸� ���� �κ�
	// - �޼ҵ尡 �����ϰ� �� �Ŀ� ���� �����
	// - ��ȯ���� ������ void ��ȯ���� ������ ���� ���¿� ���� �ڷ����� ������ �ȴ�.
	// - ��ȯ���� ��ȯ�ڷ����� ��ġ�Ǿ���Ѵ�.
	
	//return
	// - �޼ҵ��� ����
	// - ��ȯ���� ������ return�ڿ� ������ ���� ��ȯ�ȴ�.
	// - ��, ��ȯ���� �Ѱ��̴�.
	
	//�Ű�����
	// - �Ű������� �޼ҵ尡 �����Ҷ� ������ �����ؾ� �� ���� ���¸� ���� �κ�
	// - �޼ҵ��� ���� ���
	// - �Ű������� ���� �ڷ��� ������ �������.
	
	// - ����
	// - �ݵ�� �ڷ����� �Ű��������� �Ѽ�Ʈ�����Ѵ�.
	// - �������� ��� ,�� ���Ͽ� ���������ָ� �ȴ�.
	//		�ڷ��� �Ű�������
}
package oop.test03;

public class Info {
	
	//�������
	String name;
	int age,kor,eng,math,tot;
	double avg;
	
	//setData() - ������ ����޼ҵ� �Ű������� tot , avg x
	//tot = kor + eng + math;
	//avg = tot / 3.0;
	void setData(String _name,int _age,int _kor,int _eng,int _math) {
		name = _name;
		age = _age;
		kor = _kor;
		eng = _eng;
		math = _math;
		//tot =kor + eng + math;
		//avg = tot / 3.0;
		setTot();
		setAvg();
	}
	
	void setTot() {
		tot = kor + eng + math;
	}
	//setTot() , setAvg() - ���� ������ִ� �޼ҵ�
	void setAvg() {
		avg = tot / 3.0;
	}
	
	//disp() - ������ִ� �޼ҵ�
	void disp() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("���� : "+kor);
		System.out.println("���� : "+eng);
		System.out.println("���� : "+math);
		System.out.println("���� : "+tot);
		System.out.println("��� :" +avg);
	}
	
	//getter : ��ȯ���ִ� �޼ҵ� ( return�� �ִ� �޼ҵ� )
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	int getKor() {
		return kor;
	}
	int getEng() {
		return eng;
	}
	int getMath() {
		return math;
	}
	int getTot() {
		return tot;
	}
	double getAvg() {
		return avg;
	}
}

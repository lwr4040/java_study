package oop.test03;

public class Info {
	
	//멤버변수
	String name;
	int age,kor,eng,math,tot;
	double avg;
	
	//setData() - 데이터 저장메소드 매개변수에 tot , avg x
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
	//setTot() , setAvg() - 따로 계산해주는 메소드
	void setAvg() {
		avg = tot / 3.0;
	}
	
	//disp() - 출력해주는 메소드
	void disp() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+tot);
		System.out.println("평균 :" +avg);
	}
	
	//getter : 반환해주는 메소드 ( return이 있는 메소드 )
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

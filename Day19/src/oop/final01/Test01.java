package oop.final01;

public class Test01 {
	
	//final을 붙여 선언한 변수는 생성자 안에서 초기화를 진행해주어야한다.
	
	final int a;
	
	public Test01(int a) {
		this.a = a;
	}
	
	final void disp(int i) {//오버로딩 : 같은 메소드명으로 매개변수만 다르게하여 만드는것
		System.out.println(i+"disp");
	}
	
	final void disp() {
		System.out.println("disp");
	}

	public static void main(String[] args) {
		// 제한자 - 어떠한 제약 , 또는 제한을 발생시키는 키워드..
		
		//final - 최종적인, 최후의..
		// - 이것이 마지막이다..
		// - 재설정 금지
		
		//변수 - 한번 값을 설정하면 그 값이 최종적인 값이 된다.. 데이터 변경 불가능..
		
		// - 메소드 - 오버라이드 금지.. 메소드 재정의 금지 (상속이랑 관련)
		//클래스 - 상속금지
		
		final int a;
		a = 20;
		System.out.println("a = "+a);
		//a = 10; - 데이터변경 불가능
		Test01 t = new Test01(10);
		System.out.println(t.a);
		//t.a = 30; - 데이터 변경 불가능
		t.disp();
		t.disp(1);
	}

}

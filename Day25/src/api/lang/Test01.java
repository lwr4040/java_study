package api.lang;

public class Test01 /*extends Object*/{//자동 상속
	int a = 5;
	
	@Override
	public boolean equals(Object obj) {
		return this.a == ((Test01)obj).a;
	}

	public static void main(String[] args) {
		//Object - 모든 클래스의 조상
		// - 자바에서 만들어진 클래스는 반드시 최고 상위에는 Object클래스를 상속받는다.
		//	(최상위 부모)
		// - 모든 클래스가 기본적으로 가지고 있어야 할 공통적인 기능들을 가지고 있는 클래스
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Test01();//부모 참조형 변수 = 자식 인스턴스공간 생성 (업캐스팅)
		
		//getClass - 인스턴스 공간의 타입을 알려주는 메소드
		System.out.println(a.getClass());
		System.out.println(c.getClass());
		
		System.out.println("-------------------------------");
		//hashCode - 객체들을 구별하기 위한 일련번호..
		// - 나중에 해싱작업을 통하여 같은 객체를 구별할 수 있게만든다..
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println("---------------------------------");
		//equals - 객체가 같은지 판단하는 메소드
		// - 객체끼리 비교할때 사용하는 메소드
		// - Object클래스에 있는 메소드를 사용하려면 hashCode값을 비교하므로 다를 수 밖에 없다.
		// - 객체에 맞게 오버라이드 해서 사용하는 것이다.
		Test01 t1 = new Test01();
		System.out.println(t1 == c);
		System.out.println(t1.equals(c));
		
		System.out.println("----------------------------------");
		//toString - 객체의 정보를 정리하여 문자열 형태로 반환하는 메소드
		//  - 객체 상황에 맞게 오버라이드해서 사용한다..
		//	- toString 생략 가능
		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(c);
		
	}

}

package api.lang.wrapper;

public class Test01 {

	public static void main(String[] args) {
		//wrapper 클래스
		// - 기본자료형을 클래스화 시킨 자료형
		// - 기본자료형을 객체로 포장했다.
		Boolean a = new Boolean(true);
		Boolean b = new Boolean(false);
		Boolean c = new Boolean("TrUe1");
		Boolean d = new Boolean("True");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("--------------------------------");
		//객체끼리의 비교에서는 equals를 사용한다.
		System.out.println(b==c);//일반자료형끼리 비교는 true라고 나오지만 객체비교이기때문에 false가 나온다.
		System.out.println(b.equals(c));
		
		System.out.println("----------------------------------");
		System.out.println(Boolean.logicalAnd(a,d));//and - (참 , 참)
		System.out.println(Boolean.logicalXor(a, d));
		//xor - 둘중 하나만 true인 경우 true를 발생 ( 양쪽 true는 false )
		//or - 둘중 하나만 true여도 되고 양쪽다 true도 true
		
		//auto - boxing : 참조형변수에 일반 데이터를 넣으면 자동으로 객체화 시키는것..
		Boolean e = true;
		System.out.println(e.toString());//객체
		
		//auto - unboxing : 일반변수에 참조형 데이터 넣으면 자동으로 일반데이터로 변환시키는것..
		boolean f = new Boolean(true);
		System.out.println(f);//f.toString() x -> 객체가 아니기때문에
		
	}

}

package api.lang.wrapper;

public class Test02 {

	public static void main(String[] args) {
//		API에서 Integer라는 클래스를 찾으세요 (int의 wrapper class)
//		API에 써진 내용들을 토대로 필요하다면 검색엔진까지 활용하여 아래의 문제를 처리하는 코드를 구현
//		[1] a와 b라는 이름의 객체 2개를 각각 100이란 값으로 생성
		Integer a = new Integer(100);
		Integer b = 100;//auto - boxing
//		[2] 화면에 a와 b의 값을 출력
		System.out.println(a);
		System.out.println(b);
//		[3] a와 b의 값이 같은지 비교하여 화면에 같다/다르다를 출력
		if(a.equals(b)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
//		[4] a를 16진수로 변환하여 화면에 출력
		System.out.println(Integer.toHexString(a));//static메소드
		
//		[5] b를 2진수로 변환하여 화면에 출력
		System.out.println(Integer.toBinaryString(b));//static메소드
//		[6] int가 가질 수 있는 가장 큰 값을 화면에 출력
		System.out.println(Integer.MAX_VALUE);
//		[7] String x = "12321"; String y = "32123"; 이라는 변수가 있을 때
//		x + y 는 1232132123 이 나옵니다
//		44444가 나올 수 있도록 "정수로 변환"하여 덧셈해 보세요
		String x = "12321";//auto - boxing
		String y = "32123";//auto - boxing
		System.out.println(Integer.parseInt(x) + Integer.parseInt(y));
		System.out.println(Integer.valueOf(x)+Integer.valueOf(y));
		//생성자 이용방식
		System.out.println(new Integer(x) + new Integer(y));
	}

}

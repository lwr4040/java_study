package variable;

public class Test02 {

	public static void main(String[] args) {
		//정수형
		System.out.println(10);
		System.out.println(20);//단발성 데이터
		
		//정수형 자료형
		//byte		1byte	-2^7 ~ 2^7-1	-128~127
		//short		2byte	-2^15 ~ 2^15-1	-32768 ~ 32767
		//int		4byte	-2^31 ~ 2~31-1
		//long		8byte	-2^63 ~ 2^63-1
		
		//1bit - 0 or 1 둘중 하나를 저장할 수 있는 컴퓨터의 최소 데이터 단위
		//1bit * 8 = 1byte
		
		//byte b = 128; - byte는 128 크기의 숫자를 저장 x
		//short s = 128;
		//byte b = -128;
		//System.out.println(b);
		
		int a = 20;
		System.out.println(a);
		int b = 10;
		a = b;
		System.out.println(a);
		System.out.println(b);
		
		//정수형 데이터 사용시 주의 사항
		// 1. 정수형 데이터는 원형이다.
		byte c = 127;
		
		// ++ , --
		// 증감연산자 : 1증가 또는 1감소
		c++;//c = c + 1;
		System.out.println(c);
		
		c++;//129
		System.out.println(c);
		
		c = -128;
		c--;
		System.out.println(c);
		c--;
		System.out.println(c);
		
		// 2. 정수끼리의 연산에서는 정수값이 나온다.
		int d=5,e=3;//여러개의 공간에 값을 한번에 넣는방식
		//int d,e; - 같은 자료형일때는 한번에 선언이 가능하다.
		
		System.out.println(d + e);//더하기
		System.out.println(d - e);//빼기
		System.out.println(d * e);//곱하기
		System.out.println(d / e);//나누기 - 정수끼리의 연산에서는 나누기몫이나온다..
		System.out.println(d % e);//나머지
	}

}

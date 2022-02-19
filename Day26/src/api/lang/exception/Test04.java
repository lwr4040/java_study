package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0 , b = 1;
			//throw - 강제 예외 발생
			try {
				System.out.print("정수 입력 :");
				a = sc.nextInt();
				System.out.print("정수 입력 :");
				b = sc.nextInt();
				if(b == 0) {
					throw new Exception("0으로 나눌 수 없습니다");
				}
				System.out.println(a + " + "+ b+" = "+(a+b));
				System.out.println(a + " - "+ b+" = "+(a-b));
				System.out.println(a + " * "+ b+" = "+(a*b));
				System.out.println(a + " / "+ b+" = "+(a/b));
				System.out.println(a + " % "+ b+" = "+(a%b));
			}catch(Exception e) {
				sc.nextLine();
				//개발용 콘솔 로그
				e.printStackTrace();
			}
		}

	}

}

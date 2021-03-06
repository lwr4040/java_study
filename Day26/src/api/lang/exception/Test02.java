package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = 0 , b = 1;
			try {
				System.out.print("정수 입력 :");
				a = sc.nextInt();
				System.out.print("정수 입력 :");
				b = sc.nextInt();
				System.out.println(a + " + "+ b+" = "+(a+b));
				System.out.println(a + " - "+ b+" = "+(a-b));
				System.out.println(a + " * "+ b+" = "+(a*b));
				System.out.println(a + " / "+ b+" = "+(a/b));
				System.out.println(a + " % "+ b+" = "+(a%b));
			}catch(ArithmeticException e) {
				System.err.println("0으로 나눌 수 없습니다");
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.err.println("정수를 입력하셔야합니다");
			}finally {
				System.err.println("필수코드");
			}
		}
	}

}

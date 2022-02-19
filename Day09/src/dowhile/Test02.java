package dowhile;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		//숫자 입력 : 10
		//입력하신 숫자는 10입니다
		//숫자 입력 : 20
		//입력하신 숫자는 20입니다
		//숫자 입력 : 0
		//입력하신 숫자는 0입니다
		
		// - 0이외의 다른 숫자를 입력하면 계속 숫자를 입력받을 수 있고
		// 0을 입력하면 0을 출력하고 반복 종료
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print("숫자 입력 :");
			num = sc.nextInt();
			System.out.println("입력하신 숫자는 "+num+"입니다");
		}while(num != 0);
		
	}

}

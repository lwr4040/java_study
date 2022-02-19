package arrayQuiz;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문제 1) 아래 배열 a 에서 내가 입력한 값만 빼고 b 에 저장 
		int a[] = { 10,20,30,40,50 };
		int b[] = { 0,0,0,0,0 };
		// 예) 30 ==> b[] = {10,20,40,50,0};
		System.out.print("값 입력 :");
		int num = sc.nextInt();
		int idx = 0;
		for(int i=0;i<5;i++) {
			if(a[i] != num) {
				b[idx] = a[i];
				idx++;
			}
		}
		for(int i=0;i<5;i++) {
			System.out.println(b[i]);
		}
		// 문제 2) 아래 배열에서 내가 입력한 번호 와 값 만 빼고 d 에 저장
		int c[] = { 1001, 40, 1002, 65, 1003,  70 };
		int d[] = { 0,0,0,0,0,0 };
		// 예) 1002 ==> d[] = {1001, 40, 1003, 70 , 0, 0};
		System.out.print("번호 입력 :");
		num = sc.nextInt();
		idx = 0;
		for(int i=0;i<6;i+=2) {
			if(c[i] != num) {
				d[idx] = c[i];
				d[idx+1] = c[i+1];
				idx+=2;
			}
		}
		for(int i=0;i<6;i++) {
			System.out.println(d[i]);
		}
	}

}

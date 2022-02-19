package array;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		//10	20		30
		//40	50		60
		//70	80		90
		int cnt = 10;
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = cnt;
				cnt += 10;
			}
		}
		Scanner sc = new Scanner(System.in);
		// 문제 1) 인덱스 2개를 입력받아 값 출력
		// 예    1) 인덱스1 입력 : 1	인덱스2 입력 : 2
		//		   값 출력 : 60 
		System.out.print("인덱스 1 입력 :");
		int idx1 = sc.nextInt();
		System.out.print("인덱스 2 입력 :");
		int idx2 = sc.nextInt();
		System.out.println("값 출력 : " +arr[idx1][idx2]);

		// 문제 2) 값을 입력받아 인덱스 2개 출력
		// 예    2) 값 입력 : 60
		//		   인덱스1 출력 : 1	인덱스2 출력 : 2
		System.out.print("값 입력 :");
		int num = sc.nextInt();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(num == arr[i][j]) {
					System.out.print("인덱스1 출력 : "+i +"\t인덱스2 출력 : "+j);
					break;
				}
			}
		}
		System.out.println();
		// 문제 3) 가장 큰 값의 인덱스 2개 출력
		// 정답 3) 2 2
		int max = 0;
		int max_i = -1;
		int max_j = -1;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					max_i = i;
					max_j = j;
				}
			}
		}
		System.out.println(max_i +" "+max_j);
	}

}

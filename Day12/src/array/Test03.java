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
		// ���� 1) �ε��� 2���� �Է¹޾� �� ���
		// ��    1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε��� 1 �Է� :");
		int idx1 = sc.nextInt();
		System.out.print("�ε��� 2 �Է� :");
		int idx2 = sc.nextInt();
		System.out.println("�� ��� : " +arr[idx1][idx2]);

		// ���� 2) ���� �Է¹޾� �ε��� 2�� ���
		// ��    2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.print("�� �Է� :");
		int num = sc.nextInt();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(num == arr[i][j]) {
					System.out.print("�ε���1 ��� : "+i +"\t�ε���2 ��� : "+j);
					break;
				}
			}
		}
		System.out.println();
		// ���� 3) ���� ū ���� �ε��� 2�� ���
		// ���� 3) 2 2
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

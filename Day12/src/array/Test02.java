package array;

public class Test02 {

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
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		//�迭��[�����ε���][�����ε���]
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		int tot = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("��ü �� : "+tot);
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j]+"\t");
				}
			}
		}
		System.out.println();

		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		tot = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					tot += arr[i][j];
				}
			}
		}
		System.out.println("4�� ��� �� : "+tot);
		cnt = 0;
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					cnt++;
				}
			}
		}
		System.out.println("4�� ��� ���� : "+cnt);
	}

}

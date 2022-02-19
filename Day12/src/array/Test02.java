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
		
		//배열명[세로인덱스][가로인덱스]
		// 문제 1) 전체 합 출력
		// 정답 1) 450
		int tot = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				tot += arr[i][j];
			}
		}
		System.out.println("전체 합 : "+tot);
		// 문제 2) 4의 배수만 출력
		// 정답 2) 20 40 60 80
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					System.out.print(arr[i][j]+"\t");
				}
			}
		}
		System.out.println();

		// 문제 3) 4의 배수의 합 출력
		// 정답 3) 200
		tot = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					tot += arr[i][j];
				}
			}
		}
		System.out.println("4의 배수 합 : "+tot);
		cnt = 0;
		// 문제 4) 4의 배수의 개수 출력
		// 정답 4) 4
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j] % 4 == 0) {
					cnt++;
				}
			}
		}
		System.out.println("4의 배수 개수 : "+cnt);
	}

}

package array;

public class Test01 {

	public static void main(String[] args) {
//		5x5 빙고판을 만드려고 합니다
//
//		1부터 25까지의 숫자를 5X5 크기의 빙고판에 무작위로 배치하려고 합니다. 
//		모든 자리에 숫자가 랜덤으로 배치될 수 있도록 코드 구현
		
		int[][] bingo = new int[5][5];
		
		//for 반복문 1개 1~25
		//랜덤인덱스 - 세로인덱스 1개 가로인덱스 1개
//		for(int i=1;i<=25;i++) {
//			int s = (int)(Math.random() * 5);//0 1 2 3 4
//			int r = (int)(Math.random() * 5);
//			
//			if(bingo[s][r] == 0) {
//				bingo[s][r] = i;
//			}
//			else {
//				i--;
//			}
//		}
		int a = 1;
		while(a<=25) {
			int s = (int)(Math.random() * 5);//0 1 2 3 4
			int r = (int)(Math.random() * 5);
			
			if(bingo[s][r] == 0) {
				bingo[s][r] = a;
			}
			else {
				continue;
			}
			a++;
		}
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(bingo[i][j]+"\t");
			}
			System.out.println();
		}
		

	}

}

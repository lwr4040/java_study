package array;

public class Test01 {

	public static void main(String[] args) {
//		5x5 �������� ������� �մϴ�
//
//		1���� 25������ ���ڸ� 5X5 ũ���� �����ǿ� �������� ��ġ�Ϸ��� �մϴ�. 
//		��� �ڸ��� ���ڰ� �������� ��ġ�� �� �ֵ��� �ڵ� ����
		
		int[][] bingo = new int[5][5];
		
		//for �ݺ��� 1�� 1~25
		//�����ε��� - �����ε��� 1�� �����ε��� 1��
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

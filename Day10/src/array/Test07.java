package array;

public class Test07 {

	public static void main(String[] args) {
//		�ֻ����� 1000�� ������ ������ ������ ���� Ƚ���� �������� �մϴ�
//		�Ʒ��� ���� ����� ���� �� �ֵ��� �迭�� �̿��� ������ �ڵ带 ����

//		(���� ���)	
//		1 ���� Ƚ�� : 170��
//		2 ���� Ƚ�� : 180��
//		3 ���� Ƚ�� : 205��
//		...
//		6 ���� Ƚ�� : 155��
		int[] arr = new int[6];
		//1����� : 1~6 �ֻ�������
		for(int i=0;i<1000;i++) {
			int su = (int)(Math.random()*6)+1;
			if(su == 1) {
				arr[0]++;
			}
			else if(su == 2) {
				arr[1]++;
			}
			else if(su == 3) {
				arr[2]++;
			}
			else if(su == 4) {
				arr[3]++;
			}
			else if(su == 5) {
				arr[4]++;
			}
			else if(su == 6) {
				arr[5]++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+1+"�̳��� Ƚ�� : "+arr[i]);
		}
		
		//2����� : �ε�������
		int[] arr1 = new int[6];
		for(int i=0;i<1000;i++) {
			int idx = (int)(Math.random()*6);//0 1 2 3 4 5
			arr1[idx]++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+1+"�̳��� Ƚ�� : "+arr1[i]);
		}
	}

}

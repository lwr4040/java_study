package arrayQuiz;

public class Test02 {

	public static void main(String[] args) {
		// ����1)  a�� ���� b�� ���� �����ư��鼭 c�� ����
		// ��) c = {10,40,20,50,30,60}
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
		int idx = 0;
		for(int i=0;i<3;i++) {
			c[idx] = a[i];
			c[idx+1] = b[i];
			idx+=2;
		}
		for(int i=0;i<6;i++) {
			System.out.println(c[i]);
		}
				
		// ���� 2) aa �迭�� ������ ������ ��ĭ�� ���� �ǵڿ� bb��  ���� ���� 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// ��) aa = {20,30,40,50,90};
		for(int i=0;i<4;i++) {
			aa[i] = aa[i+1];
		}
		aa[4] = bb;
		for(int i=0;i<5;i++) {
			System.out.println(aa[i]);
		}
		// ���� 3) cc �� �迭�� �ڷ� �ϳ��� �о�� �� �տ� dd�� ���� ���� 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		int lastidx = 4;
		//Integer a1 = 10;
		//System.out.println("a1="+a1);
		// ��) cc[] = {60,10,20,30,40};
		for(int i=0;i<4;i++) {
			cc[lastidx] = cc[lastidx-1];
			lastidx-=1;
		}
		cc[0] = dd;
		for(int i=0;i<5;i++) {
			System.out.println(cc[i]);
		}

	}

}

package forQuiz;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * # �����л�
		 * 1. 10ȸ �ݺ��� �Ѵ�.
		 * 2. 1~100 ������ ���� ���ڸ� �����Ѵ�.(�л��� ����)
		 * 3. ������ 60�� �̻��̸� �հݻ��̴�.
		 * ---------------------------------------
		 * . ������(10��)�� ������ ����� ����Ѵ�.
		 * . �հ��� ���� ����Ѵ�.
		 * . 1�� �л��� ��ȣ�� ������ ����Ѵ�.
		 */
		int tot = 0;//����
		int cnt = 0;//�հݻ���
		int max_num = 0;//1���л� ��ȣ
		int max_score = 0;//1���л� ����
		
		for(int i=1; i<=10; i++) {
			int score = (int)(Math.random()*100) + 1;
			System.out.print(score+"\t");
			if(score > max_score) {
				max_score = score;
				max_num = i;
			}
			
			if(score >= 60) {
				cnt++;
			}
			tot += score;
		}
		System.out.println();
		double avg = tot / 10.0;
		System.out.println("���� : "+tot);
		System.out.println("��� : "+avg);
		System.out.println("�հݻ� �� : "+cnt);
		System.out.println("1���л� ��ȣ : "+max_num+"\t���� : "+max_score);
	}

}

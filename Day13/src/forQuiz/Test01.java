package forQuiz;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * # 랜덤학생
		 * 1. 10회 반복을 한다.
		 * 2. 1~100 사이의 랜덤 숫자를 저장한다.(학생의 성적)
		 * 3. 성적이 60점 이상이면 합격생이다.
		 * ---------------------------------------
		 * . 전교생(10명)의 총점과 평균을 출력한다.
		 * . 합격자 수를 출력한다.
		 * . 1등 학생의 번호와 성적을 출력한다.
		 */
		int tot = 0;//총점
		int cnt = 0;//합격생수
		int max_num = 0;//1등학생 번호
		int max_score = 0;//1등학생 성적
		
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
		System.out.println("총점 : "+tot);
		System.out.println("평균 : "+avg);
		System.out.println("합격생 수 : "+cnt);
		System.out.println("1등학생 번호 : "+max_num+"\t성적 : "+max_score);
	}

}

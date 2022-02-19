package arrayQuiz;

public class Test02 {

	public static void main(String[] args) {
		// 문제1)  a의 값과 b의 값을 번갈아가면서 c에 저장
		// 예) c = {10,40,20,50,30,60}
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
				
		// 문제 2) aa 배열의 값들을 앞으로 한칸씩 당기고 맨뒤에 bb의  값을 저장 
		int aa[] = { 10,20,30,40,50 };
		int bb = 90;
		// 예) aa = {20,30,40,50,90};
		for(int i=0;i<4;i++) {
			aa[i] = aa[i+1];
		}
		aa[4] = bb;
		for(int i=0;i<5;i++) {
			System.out.println(aa[i]);
		}
		// 문제 3) cc 의 배열을 뒤로 하나씩 밀어낸후 맨 앞에 dd의 값을 저장 
		int cc[] = { 10,20,30,40,50 };
		int dd = 60;
		int lastidx = 4;
		//Integer a1 = 10;
		//System.out.println("a1="+a1);
		// 예) cc[] = {60,10,20,30,40};
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

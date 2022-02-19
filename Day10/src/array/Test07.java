package array;

public class Test07 {

	public static void main(String[] args) {
//		주사위를 1000번 던져서 각각의 눈금이 나온 횟수를 세보려고 합니다
//		아래와 같이 결과가 나올 수 있도록 배열을 이용한 적절한 코드를 구현

//		(예상 결과)	
//		1 나온 횟수 : 170번
//		2 나온 횟수 : 180번
//		3 나온 횟수 : 205번
//		...
//		6 나온 횟수 : 155번
		int[] arr = new int[6];
		//1번방법 : 1~6 주사위랜덤
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
			System.out.println(i+1+"이나온 횟수 : "+arr[i]);
		}
		
		//2번방법 : 인덱스랜덤
		int[] arr1 = new int[6];
		for(int i=0;i<1000;i++) {
			int idx = (int)(Math.random()*6);//0 1 2 3 4 5
			arr1[idx]++;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+1+"이나온 횟수 : "+arr1[i]);
		}
	}

}

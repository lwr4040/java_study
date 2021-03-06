package api.lang.string;

public class Test01 {

	public static void main(String[] args) {
		//String 클래스
		// - JAVA에서 문자열을 총괄하는 클래스
		// - String과 Byte는 서로 떨어질 수 없는 관계
		
		String a ="Hello";//auto - boxing : 사용자의 편의를 위해서 만들었다.
		String b = new String("Hell0");
		
		char[] chs = new char[] {'H','e','L','L','o'};
		String c = new String(chs);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		//문자열 비교
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		
		//대소문자변환
		System.out.println(a.toUpperCase());//대문자로 변환
		System.out.println(a.toLowerCase());//소문자로 변환
		
		//a와 c를 비교했을때 true가 나올 수 있도록
		//String st = a.toLowerCase();
		//System.out.println(st.equals(c.toLowerCase()));
		System.out.println(a.toLowerCase().equals(c.toLowerCase()));
		System.out.println(a.equalsIgnoreCase(c));//대소문자 구별없이 비교
		System.out.println("-------------------------------");
		
		//문자열 검색
		String email = "dksrkdms00@naver.com";
		
		//startsWith - 시작문자열이 맞는가 ? 이 문자열로 시작하는가?
		System.out.println(email.startsWith("d"));
		System.out.println(email.startsWith("dks"));
		System.out.println(email.startsWith("dr"));
		System.out.println(email.startsWith("dksr",3));//내가 지정한 위치에 이 문자열로 시작하는가 ?
		System.out.println(email.startsWith("rk",3));
		
		System.out.println("-------------------------------");
		//endsWith - 이 문자열로 끝나는 가?
		System.out.println(email.endsWith(".com"));
		System.out.println(email.endsWith(".c"));
		System.out.println("---------------------------------");
		System.out.println(email.indexOf('r'));//인덱스번호
		System.out.println(email.indexOf('r',4));//몇번째 인덱스부터 확인
		System.out.println(email.lastIndexOf("r"));//문자열 뒤에서부터 확인
		System.out.println(email.lastIndexOf("r",4));//뒤에서부터 4번째인덱스 이후
		System.out.println("---------------------------------");
		//문자 추출 - charAt(i)
		System.out.println(email.charAt(1));
		
		//문자열 길이 - length()
		System.out.println(email.length());
	}

}

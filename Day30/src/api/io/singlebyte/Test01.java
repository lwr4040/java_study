package api.io.singlebyte;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		File target = new File("files","single.txt");
		
		//target에 내용 작성(출력)
		OutputStream out = new FileOutputStream(target);
		//CPU		->	out		-> target
		
		//out에게 byte단위의 데이터를 전송
		out.write(65);
		out.write(66);
		out.write(97);
		out.write('b');
		//out.write("a"); <- 문자열 불가
		
		
		//다사용한 통로 폐기
		out.close();
		System.out.println("처리 완료 !");
	}

}

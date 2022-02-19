package api.io.string;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		File target = new File("files","string1.txt");
		
		OutputStream out = new FileOutputStream(target);
		
		String text = "안녕하세요 JAVA시간입니다";
		byte[] data = text.getBytes();//String -> byte배열형태
		out.write(data);
		
		out.close();
	}

}

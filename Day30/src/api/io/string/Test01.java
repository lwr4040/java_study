package api.io.string;

import java.io.*;

public class Test01 {

	public static void main(String[] args) throws IOException {
		File target = new File("files","string1.txt");
		
		OutputStream out = new FileOutputStream(target);
		
		String text = "�ȳ��ϼ��� JAVA�ð��Դϴ�";
		byte[] data = text.getBytes();//String -> byte�迭����
		out.write(data);
		
		out.close();
	}

}
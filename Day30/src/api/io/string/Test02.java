package api.io.string;

import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		//문자열을 전용통로로 이용하기 편한 입/출력
		File target = new File("files","string2.txt");
		Writer out =new FileWriter(target);
		PrintWriter printer = new PrintWriter(out);
		
		out.write("자바\n");
		out.write("마지막\n");
		out.write("수업\n");
		out.write("입니다");
		out.write(33);
		
		
		printer.println("자바시간");
		printer.println();
		printer.println(10);
		printer.print(true);
		printer.print(false);
		
		
		out.close();
		printer.close();
	}

}

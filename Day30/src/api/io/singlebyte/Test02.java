package api.io.singlebyte;

import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		File target = new File("files","single.txt");
		
		InputStream in = new FileInputStream(target);
		//CPU<-		in	<-		target		<-실제파일
		int n;
		while(true) {
			n = in.read();//int
			if(n == -1) {//데이터가 없으면 -1
				break;
			}
			System.out.println((char)n);
		}
		in.close();
	}

}

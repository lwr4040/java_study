package api.io.string;

import java.io.*;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) throws IOException {
		File target = new File("files","string2.txt");
		
		Reader in = new FileReader(target);
		BufferedReader buffer = new BufferedReader(in);
		//CPU	<-	buffer	<- 	in <-	target	<- string2.txt
		
		//buffer를 이용하여 한줄씩 읽기
		//.readLine()		한줄씩 읽어오는 명령
		while(true) {
			String text = buffer.readLine();
			if(text == null) {
				break;
			}
			System.out.println(text);
		}
		
		//Scanner
		Scanner sc = new Scanner(target);
		while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		buffer.close();
		in.close();
		sc.close();
	}

}

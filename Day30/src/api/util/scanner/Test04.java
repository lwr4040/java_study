package api.util.scanner;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) throws IOException {
		//URL�� �д� Scanner
		
		URL url = new URL("http://www.ment.com");
		Scanner sc =new Scanner(url.openStream(),"UTF-8");
		String text = "";
		while(sc.hasNextLine()) {
			text += sc.nextLine() +"\n";
		}
		System.out.println(text);
		sc.close();
	}

}

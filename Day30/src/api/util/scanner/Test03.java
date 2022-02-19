package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//파일을 읽는 스캐너
		File target = new File("sample.txt");//파일 객체
		try {
			Scanner sc = new Scanner(target);
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없네요 !");
			e.printStackTrace();
		}

	}

}

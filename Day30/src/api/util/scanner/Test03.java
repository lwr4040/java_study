package api.util.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//������ �д� ��ĳ��
		File target = new File("sample.txt");//���� ��ü
		try {
			Scanner sc = new Scanner(target);
			
			while(sc.hasNext()) {
				System.out.println(sc.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("������ ���׿� !");
			e.printStackTrace();
		}

	}

}
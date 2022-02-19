package api.io.string;

import java.io.*;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		/*
		 * ����ڿ��� ���̵�� ��й�ȣ�� �Է¹ް� �̸� member.txt�� 
		 * �Ʒ��� ���� �������� �����Ϸ��� �մϴ�
		 * (��) ���̵� : admin
		 * ��й�ȣ : 1234 
		 * ��� ����
		 * ���̵� : test
		 * ��й�ȣ : 2345 
		 * ��� ����
		 * ====member.txt====
		 *  admin/1234
		 *  test/2345
		 */	
		//printer.flush();//���� �Է��Ѱ��� close���� �ʾƵ� �ٷ�
		//�޸��忡 ���� ���ִ� �޼ҵ�
		File target = new File("files","member.txt");
		Scanner sc = new Scanner(System.in);
		try {
			Writer out = new FileWriter(target);
			PrintWriter printer = new PrintWriter(out);
			while(true) {
				System.out.println("id : ");
				String id = sc.next();
				System.out.println("pw : ");
				String pw = sc.next();
				printer.println(id+"/"+pw);
				printer.flush();
				System.out.println("��� �Ϸ� !");
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
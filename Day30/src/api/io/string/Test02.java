package api.io.string;

import java.io.*;

public class Test02 {

	public static void main(String[] args) throws IOException {
		//���ڿ��� ������η� �̿��ϱ� ���� ��/���
		File target = new File("files","string2.txt");
		Writer out =new FileWriter(target);
		PrintWriter printer = new PrintWriter(out);
		
		out.write("�ڹ�\n");
		out.write("������\n");
		out.write("����\n");
		out.write("�Դϴ�");
		out.write(33);
		
		
		printer.println("�ڹٽð�");
		printer.println();
		printer.println(10);
		printer.print(true);
		printer.print(false);
		
		
		out.close();
		printer.close();
	}

}
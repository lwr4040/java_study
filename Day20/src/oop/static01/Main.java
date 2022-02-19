package oop.static01;

public class Main {

	public static void main(String[] args) {
		
		Test t1 = new Test(1,1);
		Test t2 = new Test(2,2);
		Test t3 = new Test(3,3);
		
		t1.disp();
		t2.disp();
		t3.disp();
		
		//t1.setSu(20);
		Test.setSu(20);
		System.out.println(Test.getSu());
		t1.disp();
		t2.disp();
		t3.disp();
	}

}

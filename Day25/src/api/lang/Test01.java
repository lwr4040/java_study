package api.lang;

public class Test01 /*extends Object*/{//�ڵ� ���
	int a = 5;
	
	@Override
	public boolean equals(Object obj) {
		return this.a == ((Test01)obj).a;
	}

	public static void main(String[] args) {
		//Object - ��� Ŭ������ ����
		// - �ڹٿ��� ������� Ŭ������ �ݵ�� �ְ� �������� ObjectŬ������ ��ӹ޴´�.
		//	(�ֻ��� �θ�)
		// - ��� Ŭ������ �⺻������ ������ �־�� �� �������� ��ɵ��� ������ �ִ� Ŭ����
		
		Object a = new Object();
		Object b = new Object();
		Object c = new Test01();//�θ� ������ ���� = �ڽ� �ν��Ͻ����� ���� (��ĳ����)
		
		//getClass - �ν��Ͻ� ������ Ÿ���� �˷��ִ� �޼ҵ�
		System.out.println(a.getClass());
		System.out.println(c.getClass());
		
		System.out.println("-------------------------------");
		//hashCode - ��ü���� �����ϱ� ���� �Ϸù�ȣ..
		// - ���߿� �ؽ��۾��� ���Ͽ� ���� ��ü�� ������ �� �ְԸ����..
		System.out.println(a.hashCode());
		System.out.println(c.hashCode());
		System.out.println(b.hashCode());
		
		System.out.println("---------------------------------");
		//equals - ��ü�� ������ �Ǵ��ϴ� �޼ҵ�
		// - ��ü���� ���Ҷ� ����ϴ� �޼ҵ�
		// - ObjectŬ������ �ִ� �޼ҵ带 ����Ϸ��� hashCode���� ���ϹǷ� �ٸ� �� �ۿ� ����.
		// - ��ü�� �°� �������̵� �ؼ� ����ϴ� ���̴�.
		Test01 t1 = new Test01();
		System.out.println(t1 == c);
		System.out.println(t1.equals(c));
		
		System.out.println("----------------------------------");
		//toString - ��ü�� ������ �����Ͽ� ���ڿ� ���·� ��ȯ�ϴ� �޼ҵ�
		//  - ��ü ��Ȳ�� �°� �������̵��ؼ� ����Ѵ�..
		//	- toString ���� ����
		System.out.println(a.toString());
		System.out.println(c.toString());
		System.out.println(c);
		
	}

}
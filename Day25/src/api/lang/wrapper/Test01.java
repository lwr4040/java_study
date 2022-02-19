package api.lang.wrapper;

public class Test01 {

	public static void main(String[] args) {
		//wrapper Ŭ����
		// - �⺻�ڷ����� Ŭ����ȭ ��Ų �ڷ���
		// - �⺻�ڷ����� ��ü�� �����ߴ�.
		Boolean a = new Boolean(true);
		Boolean b = new Boolean(false);
		Boolean c = new Boolean("TrUe1");
		Boolean d = new Boolean("True");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("--------------------------------");
		//��ü������ �񱳿����� equals�� ����Ѵ�.
		System.out.println(b==c);//�Ϲ��ڷ������� �񱳴� true��� �������� ��ü���̱⶧���� false�� ���´�.
		System.out.println(b.equals(c));
		
		System.out.println("----------------------------------");
		System.out.println(Boolean.logicalAnd(a,d));//and - (�� , ��)
		System.out.println(Boolean.logicalXor(a, d));
		//xor - ���� �ϳ��� true�� ��� true�� �߻� ( ���� true�� false )
		//or - ���� �ϳ��� true���� �ǰ� ���ʴ� true�� true
		
		//auto - boxing : ������������ �Ϲ� �����͸� ������ �ڵ����� ��üȭ ��Ű�°�..
		Boolean e = true;
		System.out.println(e.toString());//��ü
		
		//auto - unboxing : �Ϲݺ����� ������ ������ ������ �ڵ����� �Ϲݵ����ͷ� ��ȯ��Ű�°�..
		boolean f = new Boolean(true);
		System.out.println(f);//f.toString() x -> ��ü�� �ƴϱ⶧����
		
	}

}
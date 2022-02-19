package oop.test01;

public class Mobile {
//	Main.java	main()�� ������ Ŭ����
//	Mobile		�޴���ȭ Ŭ����
//	�ܼ��� ����� �Ϳ� ��ġ�� ����, �������� ���̱� ���� ������ ���� ���� ����
//		[1] �̸��� �ѹ� �����ϸ� ����� ������ �� �����ϴ�
//		[2] ������ �ƹ��� �ΰ� �����ص� 40���� �̸��� �Ұ����մϴ�
//			20�������� ������ 40�������� �����ǵ���
//		[3] ��Ż糪 ���� ���� ��� ���� ������ �����ϵ���
	private String name,tel;
	private int price;
	
	public Mobile(String name,String tel,int price) {
		this.setName(name);
		this.tel = tel;
		this.setPrice(price);
	}
	private void setName(String name) {
		this.name = name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setPrice(int price) {
		if(price < 400000) {
			System.out.println("������ �߸� �����ϼ̽��ϴ�");
			this.price = 400000;
			return;
		}
		this.price = price;
	}
	
	public String getTel() {
		return tel;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+name+"\t"+tel+"\t"+price);
	}
	
	public void compare(Mobile m) {
		if(this.price < m.price) {
			System.out.println(m.getName());
			//m�� �ϳ��� ��ü ( �Ű������� �޾ƿ� ��ü )
		}
		else if(this.price > m.price) {
			System.out.println(this.getName());
		}
		else {
			System.out.println("����");
		}
	}
	
}

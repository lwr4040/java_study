package oop.inher03;

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
	
	public Mobile() {
		
	}
	
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
		if(price < 40) {
			this.price =  40;
			return;
		}
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public int getPrice() {
		return price;
	}
	
	public void disp() {
		System.out.println(name+"\t"+tel+"\t"+price+"����");
	}
}

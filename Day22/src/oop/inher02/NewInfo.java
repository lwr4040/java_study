package oop.inher02;

public class NewInfo extends Info{
	private double hei;
	
	//this - �ڱ��ڽ� ( �ڽ�)
	//super - �θ�
	
	//���ٸ� ��ð� ������ �ڽ�Ŭ���������� �θ��� ����Ʈ�����ڰ� ȣ��ȴ�.
	//�θ��� ����Ʈ �����ڰ� ������ ���� �߻�..
	
	public NewInfo() {
		System.out.println("�ڽ� ����Ʈ ������ ���� !");
	}
	
	//�θ��� ��������� �ʱ�ȭ �Ϸ��� �ڽ�Ŭ������ �����ڿ��� �θ��� ��������ʱⰪ���� �Բ�
	//�޾��־���Ѵ�.
	
	public NewInfo(String name,int age,double hei) {
		super(name,age);//�θ� �����ڿ� ���� �ѱ��.
		this.hei = hei;//�ڽ� ( �ڱ��ڽ� )
		System.out.println("�ڽĻ�����");
	}
	
	public void setHei(double hei) {
		this.hei = hei;
	}
	
	public double getHei() {
		return hei;
	}
	
	public void disp() {
		//super.disp();//�θ�޼ҵ� disp
		System.out.println("�̸� : "+super.getName());
		System.out.println("���� : "+super.getAge());
		System.out.println("Ű : "+hei);//�ڽ� �������
	}
	
}

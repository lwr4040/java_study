package api.util.collection.set;

public class Info {
	//�̸� , ��ȭ��ȣ
	private String name;
	private String tel;
	
	public Info(String name,String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	
	public void disp() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȭ��ȣ : "+tel);
	}
}

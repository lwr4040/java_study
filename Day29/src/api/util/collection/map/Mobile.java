package api.util.collection.map;

public class Mobile {
//	Main.java	main()을 가지는 클래스
//	Mobile		휴대전화 클래스
//	단순히 만드는 것에 그치지 말고, 안정성을 높이기 위해 다음과 같이 강제 구현
//		[1] 이름은 한번 설정하면 절대로 변경할 수 없습니다
//		[2] 가격은 아무리 싸게 설정해도 40만원 미만은 불가능합니다
//			20만원으로 설정시 40만원으로 설정되도록
//		[3] 통신사나 가격 등은 계속 변경 설정이 가능하도록
	private String name;
	private String tel;
	private int price;
	
	public Mobile(String name,String tel,int price) {
		this.setName(name);
		this.setTel(tel);
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
			this.price = 400000;
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
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+name+"\t"+tel+"\t"+price+"원");
	}
	
	//shift + alt + s -> getter , setter
}

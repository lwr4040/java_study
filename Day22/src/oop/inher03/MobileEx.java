package oop.inher03;

public class MobileEx extends Mobile {

//	기존에 Mobile이라는 클래스를 사용하여 휴대전화 정보를 관리하였습니다. 
	//세월이 지나서 항목들이 추가가 되었습니다.
//	Mobile이라는 클래스는 건드리지 않고 상속을 이용하여 추가된 항목까지 저장하게 만들고 싶습니다.
	//이름은 MobileEx로 생성
//	(추가된 항목)	제휴카드(card)		수시로 설정 / 확인 가능
//				약정기간(month)	    휴대폰 약정기간(월)
	private String card;
	private int month;
	
	public MobileEx(String name,String tel,int price,String card,int month) {
		super(name,tel,price);
		this.card = card;
		this.month = month;
	}
	
	public void setCard(String card) {
		this.card = card;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public String getCard() {
		return card;
	}
	public int getMonth() {
		return month;
	}
	
	public void disp(int i) {
		System.out.println("["+i+"]\t"+super.getName()+"\t"+super.getTel()+
			"\t"+super.getPrice()+"만원\t"+this.card+"\t"+this.month+"개월");
	}
	
}

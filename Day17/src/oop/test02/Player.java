package oop.test02;

public class Player {
//	Main.java	메인을 갖는 클래스
//	Player.java	게임 캐릭터 클래스
//	(구성항목)		아이디(id), 공격력(atk), 체력(hp), 공격대상(target)
//			atk와 hp는 양수만 설정되도록 구현( > 0)
	//attack() 매개변수 x
	
	//멤버변수
	private String id;
	private int atk,hp;
	private Player target;
	
	public Player(String id,int atk,int hp) {//생성자에서 target설정 x
		this.id = id;
		this.setAtk(atk);
		this.setHp(hp);
	}
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setAtk(int atk) {
		if(atk < 0) {
			this.atk = 1;
			return;
		}
		this.atk = atk;
	}
	public void setHp(int hp) {
		if(hp < 0) {
			this.hp = 1;
			return;
		}
		this.hp = hp;
	}
	public void setTarget(Player target) {
		this.target = target;
	}
	//getter
	public String getId() {
		return id;
	}
	public int getAtk() {
		return atk;
	}
	public int getHp() {
		return hp;
	}
	public Player getTarget() {
		return target;
	}
	
	public void disp() {
		System.out.println(id + "\t"+atk +"\t"+hp+"\t"+target.getId());
	}
	
	public void attack() {
		target.hp -= this.atk;//내 공격력만큼 공격대상의 체력을 깎는다.
		//target.hp = target.hp - this.atk;
	}
	
}

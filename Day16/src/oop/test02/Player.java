package oop.test02;

public class Player {
//	Player.java	게임 캐릭터 클래스(Player)
//	(항목)	아이디(id), 레벨(level), 공격력(attack), 체력(hp)
	
//	(메소드)	disp(정보출력), +@(필요하다면)
//	(생성자)	알아서
//	(특징)	1. 캐릭터 생성시 레벨은 1, 공격력 5, 체력 20
//			2. 레벨이 증가할 경우 공격력은 3, 체력은 10씩 증가
	private String id;
	private int lev,atk,hp;
	
	public Player(String id) {
		this.id = id;
		this.lev = 1;
		this.atk = 5;
		this.hp = 20;
	}
	//setter
	public void setId(String id) {
		this.id = id;
	}
	public void setLev(int lev) {
		if(this.lev >= lev) {
			System.out.println("잘못된 레벨 입력 !");
			return;
		}
		int gap = lev - this.lev;
		this.lev = lev;
		this.atk += (gap * 3);
		this.hp += (gap * 10);
	}
	
	//getter
	public String getId() {
		return id;
	}
	public int getLev() {
		return lev;
	}
	public int getAtk() {
		return atk;
	}
	public int getHp() {
		return hp;
	}
	//레벨 1이 증가하는 메소드
	public void levUp() {
		this.lev++;
		this.atk += 3;
		this.hp += 10;
	}
	
	public void disp() {
		System.out.println(id+"\t"+lev+"\t"+atk+"\t"+hp);
	}
	
}

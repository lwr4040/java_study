package oop.test02;

public class Player {
//	Player.java	���� ĳ���� Ŭ����(Player)
//	(�׸�)	���̵�(id), ����(level), ���ݷ�(attack), ü��(hp)
	
//	(�޼ҵ�)	disp(�������), +@(�ʿ��ϴٸ�)
//	(������)	�˾Ƽ�
//	(Ư¡)	1. ĳ���� ������ ������ 1, ���ݷ� 5, ü�� 20
//			2. ������ ������ ��� ���ݷ��� 3, ü���� 10�� ����
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
			System.out.println("�߸��� ���� �Է� !");
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
	//���� 1�� �����ϴ� �޼ҵ�
	public void levUp() {
		this.lev++;
		this.atk += 3;
		this.hp += 10;
	}
	
	public void disp() {
		System.out.println(id+"\t"+lev+"\t"+atk+"\t"+hp);
	}
	
}

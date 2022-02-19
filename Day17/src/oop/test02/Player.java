package oop.test02;

public class Player {
//	Main.java	������ ���� Ŭ����
//	Player.java	���� ĳ���� Ŭ����
//	(�����׸�)		���̵�(id), ���ݷ�(atk), ü��(hp), ���ݴ��(target)
//			atk�� hp�� ����� �����ǵ��� ����( > 0)
	//attack() �Ű����� x
	
	//�������
	private String id;
	private int atk,hp;
	private Player target;
	
	public Player(String id,int atk,int hp) {//�����ڿ��� target���� x
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
		target.hp -= this.atk;//�� ���ݷ¸�ŭ ���ݴ���� ü���� ��´�.
		//target.hp = target.hp - this.atk;
	}
	
}

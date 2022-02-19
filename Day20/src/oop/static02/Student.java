package oop.static02;

public class Student {
	//private 멤버변수 : 이름 , 알고리즘 , 인공지능 , 이산수학 , 총점, 평균
	private String name;
	private int ag,ai,dm,tot;
	private double avg;
	private static int ag_t,ai_t,dm_t,tot_t,count;
	private static double avg_t;
	
	//생성자
	public Student(String name,int ag,int ai,int dm) {
		this.name = name;
		this.ag = ag;
		this.ai = ai;
		this.dm = dm;
		this.setTot();
		this.setAvg();
		Student.setAg_t(ag);
		Student.setAi_t(ai);
		Student.setDm_t(dm);
		Student.setCount();
		Student.setTot_t(tot);
		Student.setAvg_t();
	}
	
	//setter
	public void setTot() {
		this.tot = ag + ai + dm;
	}
	public void setAvg() {
		this.avg = tot / 3.0;
	}
	public void setAg(int ag) {
		this.ag = ag;
		this.setTot();
		this.setAvg();
	}
	public void setAi(int ai) {
		this.ai = ai;
		this.setTot();
		this.setAvg();
	}
	public void setDm(int dm) {
		this.dm = dm;
		this.setTot();
		this.setAvg();
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//getter
	public String getName() {
		return name;
	}
	public int getAg() {
		return ag;
	}
	public int getAi() {
		return ai;
	}
	public int getDm() {
		return dm;
	}
	public int getTot() {
		return tot;
	}
	public double getAvg() {
		return avg;
	}
	
	//멤버메소드
	public void disp() {
		System.out.println(name+"\t"+ag+"\t"+ai+"\t"+dm+"\t"+tot+"\t"+avg);
	}
	
	//static메소드 setter
	public static void setAg_t(int ag) {
		Student.ag_t += ag;
	}
	public static void setAi_t(int ai) {
		Student.ai_t += ai;
	}
	public static void setDm_t(int dm) {
		Student.dm_t += dm;
	}
	public static void setTot_t(int tot) {
		tot_t += tot;
	}
	public static void setAvg_t() {
		Student.avg_t = (double)Student.tot_t / Student.count / 3.0;
	}
	public static void setCount() {
		Student.count++;
	}
	
	//static getter
	public static int getAg_t() {
		return ag_t;
	}
	public static int getAi_t() {
		return ai_t;
	}
	public static int getDm_t() {
		return dm_t;
	}
	public static int getTot_t() {
		return tot_t;
	}
	public static double getAvg_t() {
		return avg_t;
	}
	public static int getCount() {
		return count;
	}
	
	public static void showTotal() {
		System.out.println("총계\t"+ag_t+"\t"+ai_t+"\t"+dm_t+"\t"+tot_t+"\t"+avg_t);
	}

}

package oop.inher02;

public class FountainPen extends BallPen{
//	private int amount;//남은 량
//	private String color;//볼펜의 색
//	
//	public int getAmount() {
//		return amount;
//	}
//	public void setAmount(int amount) {
//		this.amount = amount;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color=color;
//	}
	public void refill(int n) {
		setAmount(n);//할머니 할어버지의 setAmount를 불러오는거다
	}
}

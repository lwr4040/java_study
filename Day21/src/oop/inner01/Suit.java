package oop.inner01;

public class Suit {
	int price;
	Top t = new Top();
	Bottom b = new Bottom();
	
	public static class Top{
		int price;
		Top(){
			
		}
	}
	
	public class Bottom{
		int price;
	}
}

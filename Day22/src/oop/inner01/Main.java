package oop.inner01;

public class Main {

	public static void main(String[] args) {
		//익명중첩클래스 ****
		// - 클래스를 범용적으로 사용하기 위해서 부분적으로 내용을 추가하거나 재정의 하는 구문
		// - 객체의 상황에 맞지 않거나 재정의를 해야하는 경우..
		// - 객체 하나에만 영향을 준다.. 1회용 ***
		
		Key enter = new Key() {
			//메소드의 오버라이드
			// - 메소드의 재정의
			// - 메소드의 형태는 반드시 일치되어야한다.
			public void push() {
				System.out.println("실행 !");
			}
		};
		enter.push();
		Key esc = new Key() {
			public void push() {
				exit();
				System.out.println("종료 !");
			}
			public void exit() {
				System.out.println("프로그램이 종료됩니다");
				System.exit(0);
				//프로그램 종료 메소드..
				//0 - 정상종료 , 0이 아닌수 - 비정상 종료
			}
		};
		esc.push();
		//esc.exit();
		//익명중첩클래스에서 추가된 메소드는 외부에서는 사용 불가
	}

}

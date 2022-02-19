package oop.static02;

public class Main {

	public static void main(String[] args) {
//		  - static 변수 - 총점_총계, 평균_총계, 학생수_카운트 
//		  - static 변수    알고리즘_총계, 인공지능_총계, 이산수학_총계 
//		  - public 멤버함수     
//		  생성자 - 멤버변수 초기화          
//		  ShowData - 멤버변수 내용 출력    
//		  ShowTotal - 멤버변수들의 총계 출력, static 함수
		
//		 이름		알고리즘  	인공지능  	이산수학      	총점      	평균 
//		 -------------------------------------------------------------    
//		  장동건			100		100			100       		300       	100      
//		  원빈			98		78 			100       		276       	92    
//		  김태희			28		78		    30       	    136   		45.3333    
//		  한가인	        100		92		    82       	    274   		91.3333 
//		 ==============================================================      
//		  총계	        326		348         312             986   		82.1667
		
		Student st1 = new Student("장동건",100,100,100);
		Student st2 = new Student("원빈",98,78,100);
		Student st3 = new Student("김태희",28,78,30);
		Student st4 = new Student("한가인",100,92,82);
		
		st1.disp();
		st2.disp();
		st3.disp();
		st4.disp();
		System.out.println("===================================================");
		Student.showTotal();
	}

}

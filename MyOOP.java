package oop;

public class MyOOP {
//public 접근 제어자 public은 한 번만 등장
	public static void main(String[] args) {
		
		Print p1 = new Print("----");
		p1.delimiter = "----";
		/*인스턴스로 만들기 위해선 Print.java(class 생성 한 곳)에서
		 * public static void A()였던 부분에서 static(class 소속)지워야함
		 * public void A()
		 */
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****");
		p2.delimiter = "****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();

		p1.A();
		p2.A();
		p1.A();
		p2.A();
	}
	}



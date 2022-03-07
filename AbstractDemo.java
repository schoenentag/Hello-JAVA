package abstract_study;
// abstract 클래스나 메소드를 사용하기 위해서는 반드시 상속해서 사용해야한다.
abstract class A{
	//class A는 추상클래스
	public abstract int b();
	// b는 추상메소드. {}중괄호가 없고 구체적인 로직이 없음. 오버라이딩 해서 수정해서 사용해야함
	// public abstract int c(){System.out.println("Hello")} (X)
	public void d() {
		System.out.println("world");
	}
	//추상클래스 내에는 추상메소드가 아닌 메소드가 존재 할 수 있다.
}

class B extends A{
	public int b() {
		return 1;
	}
}

public abstract class AbstractDemo {
	
	public static void main(String[] args) {
		//A obj = new A(); Error
		B obj = new B();
	}

}

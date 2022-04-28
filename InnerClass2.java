package studyclass;

class Outer3{
	int value = 10; //Outer3.this.value
	
	class Inner {
		int value = 20; //this.value
		
		void method1() {
			int value = 30; //value
			System.out.println("value : " + value); //30
			System.out.println("this.value : " + this.value); //20
			System.out.println("Outer3.this.value : " + Outer3.this.value); //10
		}
	} //Inner 클래스의 끝
} // Outer클래스의 끝

public class InnerClass2 {
	public static void main(String[] args) {
		Outer3 outer = new Outer3();
		Outer3.Inner inner = outer.new Inner();
		inner.method1();
		
	}

}

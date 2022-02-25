package oop;

class Foo{
	public static String classVar = "I class var";
	public String instanceVar = "I instance var";
	public static void classMethod() {
		System.out.println(classVar); //OK
		//System.out.println(instanceVar); //Error
	}
	public void instanceMethod() {
		System.out.println(classVar); //OK
		System.out.println(instanceVar); //OK
	}
}
	public class StaticApp {

	public static void main(String[] args) {
		System.out.println(Foo.classVar); // OK
		//System.out.println(Foo.instanceVar); //Error 인스턴스는 인스턴스로만...
		Foo.classMethod();
		//Foo.instanceMethod(); //Error
		
		Foo f1 = new Foo(); //인스턴스 생성
		// instance f1이 생성 되어 Static String classVar는 참조, String instanceVar는 복제
		// instance 변수는 독립적이다, 값이 수정이 되어도 클래스 내의 값이 수정이 되지 않는다
		// static은 같이 수정됨 ★★★ 아주 중요한 개념이다!!
		// 만약 static String classVar의 변수값이 바뀌면 모든 인스턴스의 변수값이 바뀐다.
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //changed by f1
		System.out.println(f2.classVar); //changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
		/* 인스턴스 변수f1의 값을 바꾸면 f1의 변수값만 변한다 (class 내의 값이 변하지 않는다. 독립적임) 
		 * 그러므로 인스턴스 변수f2 값을 호출하면 f1을 통해 바꾼값이 출력이 되는게 아니라
		 * class내의 변하지 않은 값이 그대로 출력된다.
		 */
		
		
		
	}

}

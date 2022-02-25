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
		//System.out.println(Foo.instanceVar); //Error �ν��Ͻ��� �ν��Ͻ��θ�...
		Foo.classMethod();
		//Foo.instanceMethod(); //Error
		
		Foo f1 = new Foo(); //�ν��Ͻ� ����
		// instance f1�� ���� �Ǿ� Static String classVar�� ����, String instanceVar�� ����
		// instance ������ �������̴�, ���� ������ �Ǿ Ŭ���� ���� ���� ������ ���� �ʴ´�
		// static�� ���� ������ �ڡڡ� ���� �߿��� �����̴�!!
		// ���� static String classVar�� �������� �ٲ�� ��� �ν��Ͻ��� �������� �ٲ��.
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // I class var
		System.out.println(f1.instanceVar); // I instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); //changed by f1
		System.out.println(f2.classVar); //changed by f1
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); // changed by f1
		System.out.println(f2.instanceVar); // I instance var
		/* �ν��Ͻ� ����f1�� ���� �ٲٸ� f1�� �������� ���Ѵ� (class ���� ���� ������ �ʴ´�. ��������) 
		 * �׷��Ƿ� �ν��Ͻ� ����f2 ���� ȣ���ϸ� f1�� ���� �ٲ۰��� ����� �Ǵ°� �ƴ϶�
		 * class���� ������ ���� ���� �״�� ��µȴ�.
		 */
		
		
		
	}

}

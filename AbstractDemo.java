package abstract_study;
// abstract Ŭ������ �޼ҵ带 ����ϱ� ���ؼ��� �ݵ�� ����ؼ� ����ؾ��Ѵ�.
abstract class A{
	//class A�� �߻�Ŭ����
	public abstract int b();
	// b�� �߻�޼ҵ�. {}�߰�ȣ�� ���� ��ü���� ������ ����. �������̵� �ؼ� �����ؼ� ����ؾ���
	// public abstract int c(){System.out.println("Hello")} (X)
	public void d() {
		System.out.println("world");
	}
	//�߻�Ŭ���� ������ �߻�޼ҵ尡 �ƴ� �޼ҵ尡 ���� �� �� �ִ�.
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

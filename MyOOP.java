package oop;

public class MyOOP {
//public ���� ������ public�� �� ���� ����
	public static void main(String[] args) {
		
		Print p1 = new Print("----");
		p1.delimiter = "----";
		/*�ν��Ͻ��� ����� ���ؼ� Print.java(class ���� �� ��)����
		 * public static void A()���� �κп��� static(class �Ҽ�)��������
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



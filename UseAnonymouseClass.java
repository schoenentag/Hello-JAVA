package anonymousClass;

public class UseAnonymouseClass {
	
	TestAnony t = new TestAnony() {
		@Override
		public void testprint() {
			System.out.println("�͸�Ŭ���� �׽�Ʈ ���Դϴ�.");
		}
	};
	//testAnony�� Interface
	
	TestAnony2 t2 = new TestAnony2() {
		@Override
		public void mytestprint() {
			System.out.println("t2�� TestAnony2�� ����� ���ο� Ŭ����!!!");
		}
	};
	TestAnony t3 = new ImplTestAnony(); // �͸�Ŭ���� �ƴ�
//	ImpltestAnony t4 = new ImpltestAnony() {
//	} //ERORR �͸�Ŭ������ �ƴϱ� ������ �̷��� �� �� ����.
	
	public static void useAnonyMethod(TestAnony test) {
		test.testprint();
		
	}

	TestAbstract ta = new TestAbstract() {
		@Override
		public void absTestMethod() {
			System.out.println("�߻�Ŭ���� �׽�Ʈ");
		}
	};
	public static void main(String[] args) {
		UseAnonymouseClass a = new UseAnonymouseClass();
		a.ta.absTestMethod();
		a.t2.mytestprint();
		a.t3.testprint();
		TestAnony t4 = new TestAnony() {
			@Override
			public void testprint() {
				System.out.println("�̷������� �����ϴ�.");
			}
		};
		t4.testprint();
		useAnonyMethod(t4);
		useAnonyMethod(new TestAnony() {
			@Override
			public void testprint() {
				System.out.println("�޼ҵ��� �Ű������� Ŭ������ �ִ°͵� �����ϴ�.");
			}
		});
	}

}

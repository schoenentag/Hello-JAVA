package anonymousClass;

public class UseAnonymouseClass {
	
	TestAnony t = new TestAnony() {
		@Override
		public void testprint() {
			System.out.println("익명클래스 테스트 중입니다.");
		}
	};
	//testAnony는 Interface
	
	TestAnony2 t2 = new TestAnony2() {
		@Override
		public void mytestprint() {
			System.out.println("t2는 TestAnony2를 상속한 새로운 클래스!!!");
		}
	};
	TestAnony t3 = new ImplTestAnony(); // 익명클래스 아님
//	ImpltestAnony t4 = new ImpltestAnony() {
//	} //ERORR 익명클래스가 아니기 때문에 이렇게 쓸 수 없다.
	
	public static void useAnonyMethod(TestAnony test) {
		test.testprint();
		
	}

	TestAbstract ta = new TestAbstract() {
		@Override
		public void absTestMethod() {
			System.out.println("추상클래스 테스트");
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
				System.out.println("이런식으로 가능하다.");
			}
		};
		t4.testprint();
		useAnonyMethod(t4);
		useAnonyMethod(new TestAnony() {
			@Override
			public void testprint() {
				System.out.println("메소드의 매개변수에 클래스를 넣는것도 가능하다.");
			}
		});
	}

}

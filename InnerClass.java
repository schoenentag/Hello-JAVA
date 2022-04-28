package studyclass;

public class InnerClass {

	public static void main(String[] args) {
		Outer oc = new Outer(); // 외부 클래스의 인스턴스를 먼저 생성해야 인스턴스의 클래스의
		Outer.InstanceInner ii = oc.new InstanceInner(); //인스턴스를 생성가능
		
		System.out.println("ii.iv "+ ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		// 스태틱 내부 클래스의 인스턴트는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+si.iv);

	}

}

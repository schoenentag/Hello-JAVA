package studyclass;

public class InnerClass {

	public static void main(String[] args) {
		Outer oc = new Outer(); // �ܺ� Ŭ������ �ν��Ͻ��� ���� �����ؾ� �ν��Ͻ��� Ŭ������
		Outer.InstanceInner ii = oc.new InstanceInner(); //�ν��Ͻ��� ��������
		
		System.out.println("ii.iv "+ ii.iv);
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);
		
		// ����ƽ ���� Ŭ������ �ν���Ʈ�� �ܺ� Ŭ������ ���� �������� �ʾƵ� �ȴ�.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+si.iv);

	}

}

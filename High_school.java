package review_class;

public class High_school extends Student {
	private String FutureUniv;
	
	public High_school() {
		
	}

	
	public High_school(String name, int age, String futureUniv) {
		super(name, age);
		FutureUniv = futureUniv;
	}


	public High_school(String futureUniv) {
		super();
		FutureUniv = futureUniv;
	}


	public String getFutureUniv() {
		return FutureUniv;
	}


	public void setFutureUniv(String futureUniv) {
		FutureUniv = futureUniv;
	}
	@Override
	public void Sleep() {
		say("���� ������!");
		System.out.println(getName()+"�л��� "+getAge()+"���̰�, "+ FutureUniv +"�� ���� ���� �ᵵ ���ڰ� �����մϴ�.");
	}

	protected void say(String string) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return super.toString() + "���� ���� : "+ FutureUniv;
	}
	
	

}

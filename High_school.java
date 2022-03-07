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
		say("잠을 줄이자!");
		System.out.println(getName()+"학생은 "+getAge()+"살이고, "+ FutureUniv +"에 들어가기 위해 잠도 안자고 공부합니다.");
	}

	protected void say(String string) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return super.toString() + "지망 대학 : "+ FutureUniv;
	}
	
	

}

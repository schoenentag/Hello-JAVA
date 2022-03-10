package interface_study;

public interface Calculatable {
	public void setOprands(int first, int second, int third);
	public int sum();
	public int avg();
	// 인터페이스의 멤버는 반드시 public이다.
}

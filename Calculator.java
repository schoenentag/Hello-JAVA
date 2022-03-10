package interface_study;

class Calculator implements Calculatable{
	// Calculatable 인터페이스를 구현하고 있다.
	int first, second, third;

	public void setOprands(int first, int second, int third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	public int sum() {
		return this.first + this.second + this.third;
	}
	public int avg() {
		return (this.first + this.second + this.third)/3;
	}
	

}

package studyclass;

public class StudentClass {
	
	private String name;
	private int age;
	private int number;
	
	public void myInfo() {
		System.out.printf("내 이름은 %s, 나이는 %d, 핸드폰 번호는 %d입니다.%n", name, age, number );
	}
	
	public StudentClass(String name, int age, int number) {
		this.name = name;
		this.age = age;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
	
	

}

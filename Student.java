package review_class;

public class Student {
	private String name;
	private int age;
	
	public Student() {
		
	}
	public Student(String name) {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
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
		if (age < 0) {
			System.out.println("잘못된 값입니다.");
			this.age = 0;
		}
		else
			this.age = age;
	}
	public void Sleep() {
		System.out.println(name+"학생은 잠을 잡니다.");
	}
	protected void say(String text) {
		System.out.println(text+"라고 말합니다.");
	}


}

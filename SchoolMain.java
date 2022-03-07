package review_class;

import java.util.Scanner;

public class SchoolMain {
	//overloading
	public static void printInfo(String name) {
		System.out.println("내 이름은 "+name+"이고, 나이는 비밀입니다.");
	}
	public static void PrintInfo(String name, int age) {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("학생의 이름을 입력하세요. >>>");
		String name = s.nextLine();
		
		System.out.println("나이를 입력하세요. >>>");
		int age = Integer.parseInt(s.nextLine());
		
		printInfo(name);
		//printInfo(name,age); // Error:The method printInfo(String) in the type
					//SchoolMain is not applicable for the arguments (String, int)
		
		Student s1 = new Student(name, age);
		Student s2 = new Student("영희", 15);
		Student s3 = new Student();
		System.out.println("학생 s3의 이름은?");
		s3.setName(s.nextLine());
		System.out.println("학생 s3의 나이는?");
		s3.setAge(Integer.parseInt(s.nextLine()));
		
		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		
		Student h1 = new High_school();
		h1.setAge(17);
		h1.setName("심청");
		
		students[3] = h1;
		
		High_school h2 = new High_school("김공부",18,"하버드대");
		students[4] = h2;
		
		for (Student student : students) {
			student.Sleep();
		}
		System.out.println("printInfo test");
		printInfo(students[0].getName());
		//printInfo(students[0].getName(),students[0].getAge()); // Error 

	}
	

}

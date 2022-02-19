package studyclass;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class UseStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass hong = new StudentClass("홍길동", 30, 15986655);
		hong.myInfo();
		System.out.println(hong.getAge());
		
		
		Scanner s = new Scanner(System.in);
		
			System.out.println("이름을 입력하세요>>");		
			String n = s.nextLine();
			
			System.out.println("나이를 입력하세요>>");
			int a = s.nextInt();
			
			System.out.println("전화번호를 입력하세요>>");
			int nb = s.nextInt();
			
			StudentClass info = new StudentClass(n,a,nb);
			info.myInfo();
			
		}
	}

package studyclass;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class UseStudentClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass hong = new StudentClass("ȫ�浿", 30, 15986655);
		hong.myInfo();
		System.out.println(hong.getAge());
		
		
		Scanner s = new Scanner(System.in);
		
			System.out.println("�̸��� �Է��ϼ���>>");		
			String n = s.nextLine();
			
			System.out.println("���̸� �Է��ϼ���>>");
			int a = s.nextInt();
			
			System.out.println("��ȭ��ȣ�� �Է��ϼ���>>");
			int nb = s.nextInt();
			
			StudentClass info = new StudentClass(n,a,nb);
			info.myInfo();
			
		}
	}

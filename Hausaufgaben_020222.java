package hausaufgaben;

import java.util.Scanner;

public class Hausaufgaben_020222 {

		// TODO Auto-generated method stub
	public static void main(String[] args) {
		//1. input exercise
		Scanner s = new Scanner(System.in);
		System.out.println("�������� ���� �Է��ϼ���.");
	
		int r = s.nextInt();
		s.nextLine();
		
		final double pl = 3.14;
				
		System.out.println("���� ���� ���� : " + (r*r*pl));
		System.out.println("���� �ѷ� ���� : " + (2*r*pl));
		
		System.out.println("\n-------------\n");
		//2. input exercise
		

		System.out.println("���̸� �Է��Ͻÿ�.");
		int age = s.nextInt();
		s.nextLine();
		
		int year = 2022-age+1;
		System.out.printf("���� %d�� �¾��.\n", year);
		
		System.out.println("\n-------------\n");
		
		
		//3. input exercise
		System.out.println("�ʸ� �Է��Ͻÿ�.");
		int second =s.nextInt();
		s.nextLine();
		
		int m = second/60;
		int s2 = second%60;
		System.out.println(second + " �� " + m + "�� " + s2 + "��" );
				
		
		
				
		
				

	}

}

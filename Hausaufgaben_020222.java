package hausaufgaben;

import java.util.Scanner;

public class Hausaufgaben_020222 {

		// TODO Auto-generated method stub
	public static void main(String[] args) {
		//1. input exercise
		Scanner s = new Scanner(System.in);
		System.out.println("반지름의 값을 입력하세요.");
	
		int r = s.nextInt();
		s.nextLine();
		
		final double pl = 3.14;
				
		System.out.println("원의 넓이 공식 : " + (r*r*pl));
		System.out.println("원의 둘레 공식 : " + (2*r*pl));
		
		System.out.println("\n-------------\n");
		//2. input exercise
		

		System.out.println("나이를 입력하시오.");
		int age = s.nextInt();
		s.nextLine();
		
		int year = 2022-age+1;
		System.out.printf("나는 %d에 태어났다.\n", year);
		
		System.out.println("\n-------------\n");
		
		
		//3. input exercise
		System.out.println("초를 입력하시오.");
		int second =s.nextInt();
		s.nextLine();
		
		int m = second/60;
		int s2 = second%60;
		System.out.println(second + " ▶ " + m + "분 " + s2 + "초" );
				
		
		
				
		
				

	}

}

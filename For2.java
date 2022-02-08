package loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);

		
		System.out.println("단을 입력하십시오.");
		int dan = s.nextInt();
		s.nextLine();
		

		for (int num = 1; num <=9; num++) {
			System.out.println((dan + "x" + num) + "=" + dan*num);
		}
		
		System.out.println("-----------");
		

		for (int dan2 = 2; dan2 <= 9; dan2++) {
			System.out.println(dan2+"단");
			for (int num2 = 1; num2 <= 9; num2++) {
				System.out.println((dan2 + "x" + num2) + "=" + dan2*num2);
			}
			System.out.print('\n');
		}
		
		System.out.println("별트리만들기 ()층");
		int floor = s.nextInt();
		for (int i = 0; i < floor; i++ ) { 
			for (int j = 0; j<floor-1-i; j++) {
				
				System.out.print(' ');
			}
			for (int k = 0; k < 2*i+1; k++) {
				System.out.print('*');
			}
			System.out.println();
		}

		
	}

}

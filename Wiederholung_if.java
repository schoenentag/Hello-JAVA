package wiederholungen;

import java.util.Scanner;

public class Wiederholung_if {

	public static void main(String[] args) {
		// if -else if
		
		int score = 0;
		char grade = ' ';
		System.out.println("������ �Է��ϼ���. >>>");
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("����� ������ "+ grade + "�Դϴ�.");
		
		//��ø if
		
		int score_add =0;
		char grade_add = ' ', opt ='0';
		System.out.println("�߰� ������ �Է��ϼ���. >>>");
		score_add = scanner.nextInt();
		
		if (score_add >= 90) {
			grade_add = 'A';
			if (score_add >= 98) {
				opt = '+';
			} else if (score_add < 94)
				opt = '-';
			if (score_add >= 98) {
				opt = '+';
			} else if (score_add < 94)
				opt = '-';
		} else if (score_add >= 80) {
			grade_add = 'B';
			if (score_add >= 88) {
				opt = '+';
			} else if (score_add < 84)
				opt = '-';
		}
		 else {
			grade_add = 'C';}
		System.out.printf("����� ������ %c%c�Դϴ�.%n", grade_add, opt);
	}

}

package wiederholungen;

import java.util.Scanner;

public class Wiederholung_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =5;
		while(i--!=0) {
			System.out.println(i + " - I can do it.");
		}
		//
		int sum = 0;
		int ii = 0;
		while (sum <= 100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++ii;
		}
		//
		int num = 0; sum = 0;
		System.out.println("숫자를 입력하세요.(예:12345)>>>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num != 0) {
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n",sum, num);
			num /= 10;
		}
		System.out.println("각 자리수의 합:" + sum);
		
		

	}

}

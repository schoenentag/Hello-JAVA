package wiederholungen;

import java.util.Scanner;

public class Wiederholung_break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break
		int sum = 0;
		int i = 0;
		
		while(true) {
			if (sum > 100)
				break;
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);
		//continue
		for (i = 0; i <= 10; i++) {
			if (i%3 == 0)
				continue;
			System.out.println(i);
		}
		//Practice
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0)>>>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue;
			}
			System.out.println("선택하신 메뉴는 " + menu +"번입니다.");
		}
		
	}

}

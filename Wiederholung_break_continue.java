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
			System.out.println("���ϴ� �޴�(1~3)�� �����ϼ���. (����:0)>>>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			if (menu == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else if (!(1 <= menu && menu <=3)) {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�. (����� 0)");
				continue;
			}
			System.out.println("�����Ͻ� �޴��� " + menu +"���Դϴ�.");
		}
		
	}

}

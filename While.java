package loop;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'A';
		while(true) {
			System.out.println(a);
			if (a == 'Z')
				break;
			a++;
		}
		int sum = 0;
		int i = 0;
		while (i < 100) {
			i++;
			sum += i;
		}
		System.out.println("sum =" + sum);
		System.out.println("i=" + i);
	
	
		do {
			System.out.println("do while »ç¿ëÁß...");
		} while (i<100);
		
		}

}

package loop;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		for (int num = 0; num <=100; num++)
			System.out.print(num);
		System.out.println('\n');
	
			int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum += i;
			}
		System.out.println("1~100까지의 합은 "+sum+"이다.");

		
		for (char a = 'A'; a <='z'; a++) {
			
			if (a > 'Z' && a < 'a')
				continue;
			System.out.print(a);
		}		
	}
		
	}



package wiederholungen;

public class Wiederholung_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=5; i++) {
			System.out.println("I can do it.");
		}
		for (int i = 1; i <=5; i++)	{
			System.out.println(i);
		}
		for (int i = 1; i <=5; i++) 
			System.out.print(i);
		System.out.println( );
		
		int sum = 0;
		for (int i = 1; i <=5; i++) {
			sum += i;
			System.out.printf("1부터 %2d까지의 합 : %2d%n", i, sum);
		}
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

package wiederholungen;

public class Wiederholung_Math_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		
		for (int i =1; i <= 5; i++) {
			num = (int) (Math.random() * 6) + 1; // 1~6 random
			System.out.println(num);
					
		}

	}

}

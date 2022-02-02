package hausaufgaben;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (20 > 18) {
			System.out.println("20 is greater than 18");
			
		int x = 20;
		int y = 18;
		if (x > y) {
			System.out.println("x is greater than y");
			System.out.println(x+" is greater than " + y);
			
		int a = 15, b;
		if (a > 10) {
			b = a - 10;
			System.out.println(b);
		
		int a1 = 10, b1 =20;
		if (a1 > b1) {
			System.out.println(a1-b1);
		} else{
			System.out.println(b1-a1);}
		}
		
		int note = 85;
		if (note >= 90) {
			System.out.println("A등급입니다.");
		} else if (note >= 80) {
			System.out.println("B등급입니다.");
		} else {
			System.out.println("C등급입니다.");
		}
		}
		}
	}
}

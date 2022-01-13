package binary;

public class BinaryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//양수
		int num = 10;
		int bNum = 0B1010; //10
		int oNum = 012; //10
		int hNum = 0XA; //10
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
		
		// 음수 
		int num1 = 0B00000000000000000000000000000101; //5
		int num2 = 0B11111111111111111111111111111011; //-5
		
		int sum = num1 + num2;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(sum);
		
	}

}

package array;

public class Array {
	
	public static void main(String[] args) {
		int[] odds = {1, 3, 5, 7, 9};
		String[] weeks = {"��", "ȭ", "��", "��", "��", "��", "��"};
		System.out.println(weeks[3]); // ��
		
		for (int i = 0; i < weeks.length; i++) {
			System.out.print(weeks[i]);
		}
		System.out.println();
		
		int a[] = new int[5];
		int j;
		for (j = 0; j < 5; j++)
			a[j] = j + 10;
		for (j = 0; j <5; j++)
			System.out.println(a[j]);
	
}
}

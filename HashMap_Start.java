package collection;

import java.util.HashMap;

public class HashMap_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h = new HashMap();
		
		h.put(1, "A");
		System.out.println(h);
		
		h.put(1, "C");
		System.out.println(h); // 1�� ���� A���� C�� ����
		
		h.put(2, "D");
		System.out.println(h); // D�� �߰�
		
		h.remove(1);
		System.out.println(h); //1�� �� ����
		
		System.out.println(h.get(2)); //Ű���� 2�� ��� ���
		System.out.println(h.size()); //���� ���
	}

}

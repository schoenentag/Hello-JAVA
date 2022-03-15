package collection;

import java.util.HashMap;

public class HashMap_Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h = new HashMap();
		
		h.put(1, "A");
		System.out.println(h);
		
		h.put(1, "C");
		System.out.println(h); // 1의 값이 A에서 C로 변경
		
		h.put(2, "D");
		System.out.println(h); // D값 추가
		
		h.remove(1);
		System.out.println(h); //1의 값 삭제
		
		System.out.println(h.get(2)); //키값이 2인 밸류 출력
		System.out.println(h.size()); //개수 출력
	}

}

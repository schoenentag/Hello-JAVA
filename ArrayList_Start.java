package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Start {

	public static void main(String[] args) {
		// ArrayList : 크기가 가변적으로 변하는 선형리스트의 성질을 가진 클래스, 순서중요
		// LinkedList : 데이터를 저장하는 노드가 이전 노드와 다음 노드의 상태를 알고 있는 링크드 리스트 자료구조를 구현한 클래스
		// ArrayList와 LinkedList 클래스의 기능은 같다. 두 클래스 모두 부모가 List이므로 메서드도 같다.
		// List a = new ArrayList(); 대신에 List 변수명 = new LinkedList();로 선언해도 정상적으로 작동하고, 동일한 결과 출력
		
		List a = new ArrayList();
		
		a.add(2);
		System.out.println(a);
		
		a.add(1);
		System.out.println(a);
		
		a.add(1);
		System.out.println(a); //중복값 허용
		
		a.add(1,3);
		System.out.println(a); // 1번째값에 3을 추가 // 출력값 : [2, 3, 1, 1]
		
		a.remove(2);
		System.out.println(a); //2번째값을 제거
		
		System.out.println(a.get(2)); //2번째 값 출력
		System.out.println(a.size());

	}

}

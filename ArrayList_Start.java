package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Start {

	public static void main(String[] args) {
		// ArrayList : ũ�Ⱑ ���������� ���ϴ� ��������Ʈ�� ������ ���� Ŭ����, �����߿�
		// LinkedList : �����͸� �����ϴ� ��尡 ���� ���� ���� ����� ���¸� �˰� �ִ� ��ũ�� ����Ʈ �ڷᱸ���� ������ Ŭ����
		// ArrayList�� LinkedList Ŭ������ ����� ����. �� Ŭ���� ��� �θ� List�̹Ƿ� �޼��嵵 ����.
		// List a = new ArrayList(); ��ſ� List ������ = new LinkedList();�� �����ص� ���������� �۵��ϰ�, ������ ��� ���
		
		List a = new ArrayList();
		
		a.add(2);
		System.out.println(a);
		
		a.add(1);
		System.out.println(a);
		
		a.add(1);
		System.out.println(a); //�ߺ��� ���
		
		a.add(1,3);
		System.out.println(a); // 1��°���� 3�� �߰� // ��°� : [2, 3, 1, 1]
		
		a.remove(2);
		System.out.println(a); //2��°���� ����
		
		System.out.println(a.get(2)); //2��° �� ���
		System.out.println(a.size());

	}

}

package studyclass;
import java.util.*;

public class IteratorEX {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("자바왕",1,1));
		list.add(new Student("자바짱",1,2));
		list.add(new Student("홍길동",2,1));

//		Iterator<Student> it = list.iterator(); // 에러 뜨는 이유를 모르겠음..ㅠ
//		while (it.hasNext()) {
//			Student s = it.next();
//			System.out.println(s.name);
//		}
	}
}
class Student{
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
}
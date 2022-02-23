package ex;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// TODO Auto-generated method stub
		System.out.println(Math.PI); //Math는 class
		System.out.println(Math.floor(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		//Math와 같은 클래스이지만 f1원이라는 변수를 만들어 복제본을 담음-data.txt파일을 만드는 클래스
		f1.write("Hello");
		f1.write(" Java");
		f1.close();

	}
	

}

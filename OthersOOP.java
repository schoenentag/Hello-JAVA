package ex;

import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		// class : System, Math, FileWriter
		// instance : f1, f2
		
		// TODO Auto-generated method stub
		System.out.println(Math.PI); //Math�� class
		System.out.println(Math.floor(1.8));
		
		FileWriter f1 = new FileWriter("data.txt");
		//Math�� ���� Ŭ���������� f1���̶�� ������ ����� �������� ����-data.txt������ ����� Ŭ����
		f1.write("Hello");
		f1.write(" Java");
		f1.close();

	}
	

}

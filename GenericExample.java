package studyclass;

import java.util.*;

class Product{}
class Tv extends Product {}
class Audio extends Product {}


public class GenericExample {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
		//ArrayList<Product> tvtList = new ArrayList<Tv>(); // ERROR!
		//List<Tv> tvList = new ArrayList<Tv>(); // ´ÙÇü¼ºOK
		
		productList.add(new Tv());
		productList.add(new Audio());
		
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		printAll(productList);
		//pritAll(tvList); 
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
	}

}

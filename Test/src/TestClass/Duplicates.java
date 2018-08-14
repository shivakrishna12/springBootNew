package TestClass;

import java.util.ArrayList;
import java.util.Iterator;

public class Duplicates {
	
	public static void main(String[] args) {
		
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(1);
		al.add(13);
		al.add(12);
		al.add(13);
		al.add(12);
		al.add(1);
		
		
		ArrayList<Integer>  al2 =new ArrayList<Integer>();
		
		Iterator<Integer> i=al.iterator();
		
		while(i.hasNext()) {
	
			    int value=i.next();
			
			
			if(al2.contains(value)) {
				
				
				
			}else {
				
				
				al2.add(value);
			}
			
			
		}
		System.out.println(al2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

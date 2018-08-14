package TestClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestPrakash {

	public static void main(String[] ars) {
		ArrayList<String> al = new ArrayList();
		al.add("shiva23");
		al.add("prakash23");
		al.add("shiva2222");
		al.add("prakash2111111");
		al.add("shiva krishna");
		al.add("prakash");
		al.add("shiva12");
		al.add("prakash12");
		
		
		/* ======================================== */
		System.out.println("=========================================");
		for (String a : al) {
			System.out.println(a);
		}
		
		al.add(3,"eeeeeeeeeeeeeeeeeeeeeeeeeprakash12");
		/* ======================Sorting order in list============================ */
		Collections.sort(al);
		System.out.println(al);
		 /* ====Reverse Sorting order in list====== */
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
	}
}

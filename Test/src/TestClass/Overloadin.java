package TestClass;


public class Overloadin {
	public void add(int a,int b) {
		System.out.println(a+b);
	}

	public float add(float a,float b) {
		
		float d=(float) (a+b);
		System.out.println("==========================="+d);
		return d;
	}
public static void main(String[] args) {
	
	Overloadin  over=new Overloadin();
	
	over.add(10, 20);
	
	over.add(10.2f, 2.2f);
	
}
}

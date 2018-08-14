package TestClass;

public class SingletonExample {
	public static SingletonExample s=null;
	
	private SingletonExample() {
		
	}
	
	public static  SingletonExample  getInstance() {
		
		if(s.equals(null)) {
			s=new SingletonExample();
		}
		
		return s;
		
		
	}

}

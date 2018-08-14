package TestClass;
public class TreeSettExample implements Cloneable{
	int empId;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	String name;
	int salary;
	String address;
	public static void main(String[] args) throws CloneNotSupportedException {
		TreeSettExample ts=new TreeSettExample();
		ts.setAddress("Hyderabad");
		ts.setName("shiva krishna");
		ts.setSalary(100000);
		ts.setEmpId(1);
	TreeSettExample o=(TreeSettExample)ts.clone();	
	System.out.println("oooo---------"+ts);
	System.out.println("object================="+o);
	
	 System.out.println(o.getAddress());
	 System.out.println(ts.getSalary());
	 
	}
}

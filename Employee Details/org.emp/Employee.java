
public class Employee {
public void empId() {
System.out.println("empId is")	;
}
public void empName() {
	System.out.println("empName is");
}
public void empDOB() {
	System.out.println("empDOB is");
}
public void empPhone() {
	System.out.println("empPhone is");
}
public void empMail() {
	System.out.println("empMail is");
}
public void empAddress() {
	System.out.println("empAddress is");
}
public static void main(String[]args) {
	Employee emp=new Employee();
	emp.empName();
	emp.empDOB();
	emp.empPhone();
	emp.empMail();
	emp.empAddress();
}
}


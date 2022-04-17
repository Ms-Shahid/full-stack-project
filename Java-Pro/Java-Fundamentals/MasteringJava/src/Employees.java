
public class Employees {

	private int salary;
	private int bonus;

	public void showEmployeeSalary(int salary, int bonus) {
		this.salary = salary;
		this.bonus = bonus;
	}
	
	private String departmentName;

	public void showDepartment(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public static void main(String[] args) {
		
		Employees E1 = new Employees();
		E1.showEmployeeSalary(25000,15000);
		E1.showDepartment("Juniour Dev");
		
		Employees E2 = new Employees();
		E2.showEmployeeSalary(30000,15000);
		E2.showDepartment("Assosiate Dev");
		
		Employees E3 = new Employees();
		E3.showEmployeeSalary(40000,15000);
		E3.showDepartment("Senior Dev");
	}
}

package entities;

public class EmployeeList {

	
	private Integer id;
	private String name;
	private Double salary;

	public EmployeeList(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public Integer getId() {
		return id;
	}

	public void increaseSalary(double percentage) {

		 this.salary = this.salary * (1 + (percentage / 100));
	}
	
	public String toString() {
		
		return id + ", " + name + ", " + String.format("%.2f", salary); 
	}
	
	
}

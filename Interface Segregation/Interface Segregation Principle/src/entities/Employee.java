package entities;

public abstract class Employee implements ICalculateSalary{
	private String name;
	private String cpf;
	private String registration;
	private double salary;
	private double netSalary;
	
	public Employee(String name, String cpf, String registration, double salary) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.registration = registration;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getRegistration() {
		return registration;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getNetSalary() {
		return netSalary;
	}

	public void calculateSalary() {
		this.netSalary = this.salary - (this.salary * 0.08);
		System.out.println("Funcionário: " + this.getName() + "\nSalário: " + this.getNetSalary());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", cpf=" + cpf + ", registration=" + registration + ", salary=" + salary
				+ ", netSalary=" + netSalary + "]";
	}
	
}

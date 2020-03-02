package entities;

public abstract class Employee implements ICalculateSalary {
	private String name;
	private String cpf;
	private String registration;
	private double salary;
	private double netSalary;
	public double totalSales;
	public double commission;

	public Employee(String name, String cpf, String registration, double salary, double totalSales) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.registration = registration;
		this.salary = salary;
		this.totalSales = totalSales;
		this.commission = 0;
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

	public void setRegistration(String registration) {
		this.registration = registration;
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

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	public double getCommission() {
		return commission;
	}

	public void calculateSalary() {
		this.netSalary = this.salary - (this.salary * 0.08);
		System.out.println("Funcionário: " + this.getName() + "\nSalário: " + this.getNetSalary());
	}

	public void calculateCommission() {
		this.commission = this.totalSales * 0.02;
		System.out.println("Comissão: " + this.getCommission());
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", cpf=" + cpf + ", registration=" + registration + ", salary=" + salary
				+ ", netSalary=" + netSalary + "]";
	}

}

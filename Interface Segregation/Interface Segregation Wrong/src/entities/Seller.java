package entities;

public class Seller extends Employee implements ICalculateCommission {
	private String sex;

	public Seller(String name, String cpf, String registration, double salary, double totalSales, String sex) {
		super(name, cpf, registration, salary, totalSales);
		this.sex = sex;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Seller [sex=" + sex + "]";
	}

}

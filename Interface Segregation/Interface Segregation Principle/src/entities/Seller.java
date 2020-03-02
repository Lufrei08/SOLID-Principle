package entities;

public class Seller extends Employee implements ICalculateCommission{
	private double totalSales;
	private double commission;
	
	public Seller(String name, String cpf, String registration, double salary, double totalSales) {
		super(name, cpf, registration, salary);
		this.totalSales = totalSales;
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
	
	public void calculateCommission() {
		this.commission = this.totalSales * 0.02;
		System.out.println("Comissão: " + this.getCommission());
	}
	
}

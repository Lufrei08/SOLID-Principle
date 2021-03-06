package entities;

public class Accountant extends Employee {
	private String crc;

	public Accountant(String name, String cpf, String registration, double salary, double totalSales, String crc) {
		super(name, cpf, registration, salary, totalSales);
		this.crc = crc;
	}

	public String getCrc() {
		return crc;
	}

	public void setCrc(String crc) {
		this.crc = crc;
	}

	@Override
	public String toString() {
		return "Accountant [crc=" + crc + "]";
	}

}

package entities;

public class Main {

	public static void main(String[] args) {
		
		Accountant f1 = new Accountant("Euler Gotardo", "15869856978", "00000012", 2200, "256987");
		f1.calculateSalary();
		
		Seller f2 = new Seller("Cassiana Bonato", "58968745872", "00000001", 3500, 5860);
		f2.calculateSalary();
		f2.calculateCommission();
	}

}

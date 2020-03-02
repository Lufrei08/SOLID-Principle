package entities;

public class Main {

	public static void main(String[] args) {
		
		Accountant f1 = new Accountant("Euler Gotardo", "15478458", "0000000012", 2200, 0, "256987");
		f1.calculateSalary();
		f1.calculateCommission();
		
		Seller f2 = new Seller("Cassiana Bonato", "8847968547894789", "000001", 3500, 5860, "F");
		f2.calculateSalary();
		f2.calculateCommission();
	}

}
 
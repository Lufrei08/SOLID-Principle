package Entities;

public class Main {

	public static void main(String[] args) {
		Address ad1 = new Address("Rua 5", 10, "Centro", "Condomio Lux", "Morrinhos", "GO", "78495631");
		Address ad2 = new Address("Rua José Figueira", 564, "Vila do Mato", "Praça do Caiz", "Itumbiara", "GO", "54876");
		System.out.println(ad1.toString());
		System.out.println(ad2.toString());
		
		Person p1 = new Person("Luiz da Silva", "9998884", ad1, "(65)7845-5748", "luizdaluz@gmail.com");
		Person p2 = new Person("Zé da Tabacaria", "87594247", ad2, "(64) 8754-9657", "tabacodoze@hotmail.com");
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		LegalPerson lp1 = new LegalPerson("Alienas Eireli ME", "Editora Grobu", "7845954782147", ad2, "64 9847848", "grobuemizora@gmail.com");
		LegalPerson lp2 = new LegalPerson("Manoel da Leitura Master", "Biblioteca da Cidade", "87582572725", ad1, "6457567845", "livroslegais@gmail.com");
		System.out.println(lp1.toString());
		System.out.println(lp2.toString());
		
		Book b1 = new Book("Tabaco", "784457", p2, lp1, "1995", "Para os amantes de tabaco");
		Book b2 = new Book("Estrelas", "78457", p1, lp1, "2005", "A incrivel historia do universo de uma forma que você nunca viu");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
		Movies m1 = new Movies("Jason", "2002", p1, "Um cara que mata todo mundo", "terror");
		System.out.println(m1.toString());
		
		CyberCafe cb1 = new CyberCafe(1, 2.5);
		cb1.calculateConsumption(5.00);
		cb1.calculateConsumption(15.00);
		System.out.println(cb1.toString());
		
		Library lb1 = new Library(lp1);
		lb1.addWorkOfArt(cb1);
		lb1.addWorkOfArt(m1);
		lb1.addWorkOfArt(b2);
		lb1.addWorkOfArt(b1);
		System.out.println(lb1.toString());
		
		Loan l1 = new Loan(p1, b1);
		//Loan l2 = new Loan(p2, b1);
		System.out.println(l1.toString());

	}

}

package Entities;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person("Lucas", "9999888", "Rua Joaquim Quieto nº10 - Centro", "(99) 99999-9999", "naotem@hotmail.com");
		System.out.println(p1.toString());
		
		Library lib1 = new Library("Seu Joaquim", "7845963214784", "Babilonia", "(64) 3485-6574", 
				"bibliotecadojoaquim@hotmail.com", "Rua do Mato nº7 - Vila Betania");
		System.out.println(lib1.toString());
		
		Book b1 = new Book("As tranças da vovo careca", "784547", p1, "Globo", "2019", "Uma vovó travessa e suas tranças");
		System.out.println(b1.toString());
		
		Loan l1 = new Loan(p1, b1);
		System.out.println(l1.toString());
		
		/*Loan l2 = new Loan(p1, b1);
		System.out.println(l2.toString());*/
	}

}

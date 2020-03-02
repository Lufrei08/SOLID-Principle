package Entities;


public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Teste", "06578515151", "Rua 5 nº 10 - Centro", "(64) 99999-8888", "testecabuloso.@gmail.com");
		System.out.println(p1.toString());
		
		Book b1 = new Book("As tranças da vovó careca", "666666", p1, "Osasco Espuleta de Canhão", "1998", "Isso ai mesmo");
		System.out.println(b1.toString());
		
		Library l1 = new Library("Joãozinho", "7891546", "Babilonia", "9999-9999", null, "Rua 7 º10 - Centro");
		System.out.println(l1.toString());
		
		Loan loan1 = new Loan(p1, b1);
		System.out.println(loan1.toString());
		
		Loan loan2 = new Loan(p1, b1);
		System.out.println(loan2.toString());

	}

}
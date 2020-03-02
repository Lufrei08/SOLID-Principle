package Entities;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address end1 = new Address("Av São Joao", 10, "Centro", "Praça Verde", "Morrinhos", "GO", "75620000");
		Address end2 = new Address("Rua dos Carneiros", 258, "Vila dos Camponeses", "Portão Azul", "Morrinhos", "GO", "75620000");
		Address end3 = new Address("Alameda dos Macacos", 687, "Morro do Café", "Árvore escorrega macaco", "Morrinhos", "GO", "75620000");
		
		System.out.println(end1.toString());
		System.out.println(end2.toString());
		System.out.println(end3.toString());
		
		Person per1 = new Person("Robert C. Martin ", "36985748521", end1, "64985685236", "robertmartin@gmail.com");
		Person per2 = new Person("Baianinho do Maua", "15874569823", end2, "6434561258", "baianinho@gmail.com");
		
		System.out.println(per1.toString());
		System.out.println(per2.toString());
		
		LegalPerson legPer1 = new LegalPerson("Alta Books", "Alta Books", "25698632000147", end3, "64985687584", "altabooks@gmail.com");
		LegalPerson legPer2 = new LegalPerson("Biblioteca Sao Francisco", "Biblioteca Sao Francisco", "25869587000258", end1, "6498756875421", "bibsaofrancisco@gmail.com");
		
		System.out.println(legPer1.toString());
		
		WorksOfArt works1 = new Book("Code Clean", "8576082675", per1, legPer1, "2012", "Mesmo um código ruim pode funcionar. Mas se ele não for limpo, pode acabar com uma empresa de desenvolvimento. Perdem-se a cada ano horas incontáveis e recursos importantes devido a um código mal escrito. Mas não precisa ser assim.");
		WorksOfArt works2 = new Book("Arquitetura Limpa", "8550804606", per1, legPer1, "2019", "As regras universais de arquitetura de software aumentam dramaticamente a produtividade dos desenvolvedores ao longo da vida dos sistemas de software. ");
		
		System.out.println(works1.toString());
		System.out.println(works2.toString());
		
		Library library = new Library(legPer2);
		library.addWorkOfArt(works1);
		library.addWorkOfArt(works2);
		
		System.out.println(library.toString());
		
		Loan loan1 = new Loan(per2, works1);
		System.out.println(loan1.toString());
		
		Loan loan2 = new Loan(per2, works2);
		System.out.println(loan2.toString());
	}

}

package Entities;

public class Book extends WorksOfArt {
	private String name;
	private String isbn;
	private Person author;
	private LegalPerson publishingCompany;
	private String year;
	private String description;
	
	public Book(String name, String isbn, Person author, LegalPerson publishingCompany, String year,
			String description) {
		super(true);
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.year = year;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Person getAuthor() {
		return author;
	}

	public void setAuthor(Person author) {
		this.author = author;
	}

	public LegalPerson getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(LegalPerson publishingCompany) {
		this.publishingCompany = publishingCompany;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", isbn=" + isbn + ", author=" + author + ", publishingCompany="
				+ publishingCompany + ", year=" + year + ", description=" + description + "]";
	}
}
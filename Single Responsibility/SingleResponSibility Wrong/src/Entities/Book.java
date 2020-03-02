package Entities;

public class Book {
	private boolean avaliable;
	private String name;
	private String isbn;
	private Person author;
	private String publishingCompany;
	private String year;
	private String description;

	public Book(String name, String isbn, Person author, String publishingCompany, String year, String description) {
		super();
		this.avaliable = true;
		this.name = name;
		this.isbn = isbn;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.year = year;
		this.description = description;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
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

	public String getPublishingCompany() {
		return publishingCompany;
	}

	public void setPublishingCompany(String publishingCompany) {
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
		return "Book [avaliable=" + avaliable + ", name=" + name + ", isbn=" + isbn + ", author=" + author
				+ ", publishingCompany=" + publishingCompany + ", year=" + year + ", description=" + description + "]";
	}

}
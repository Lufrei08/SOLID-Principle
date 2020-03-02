package Entities;

import java.util.ArrayList;

public class Library {
	private String owner;
	private String cnpj;
	private String fantasyName;
	private String phone;
	private String email;
	private String address;
	private ArrayList<Book> books;

	public Library(String owner, String cnpj, String fantasyName, String phone, String email, String address) {
		super();
		this.owner = owner;
		this.cnpj = cnpj;
		this.fantasyName = fantasyName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.books = new ArrayList<Book>();
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Book> getBooks() {
		return books;
	}

	public boolean addBook(Book book) {
		return this.books.add(book);
	}

	public boolean removeWorkOfArt(Book book) {
		return this.books.remove(book);
	}

	@Override
	public String toString() {
		return "Library [owner=" + owner + ", cnpj=" + cnpj + ", fantasyName=" + fantasyName + ", phone=" + phone
				+ ", email=" + email + ", address=" + address + ", books=" + books + "]";
	}

}

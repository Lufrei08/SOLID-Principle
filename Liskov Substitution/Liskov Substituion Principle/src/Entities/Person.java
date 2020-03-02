package Entities;


public class Person {
	private String name;
	private String cpf;
	private Address adress;
	private String phone;
	private String email;
	
	public Person(String name, String cpf, Address adress, String phone, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.adress = adress;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Address getAdress() {
		return adress;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", cpf=" + cpf + ", adress=" + adress + ", phone="
				+ phone + ", email=" + email + "]";
	}
	
}
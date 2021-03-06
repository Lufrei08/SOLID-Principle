package Entities;

public class Person {
	private String name;
	private String cpf;
	private String address;
	private String phone;
	private String email;

	public Person(String name, String cpf, String address, String phone, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
		return "Person [name=" + name + ", cpf=" + cpf + ", address=" + address + ", phone=" + phone + ", email="
				+ email + "]";
	}

}
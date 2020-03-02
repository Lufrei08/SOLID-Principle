package Entities;

public class LegalPerson {
	private String name;
	private String fantasyName;
	private String cnpj;
	private Address address;
	private String phone;
	private String email;
	
	public LegalPerson(String name, String fantasyName, String cnpj, Address address, String phone, String email) {
		super();
		this.name = name;
		this.fantasyName = fantasyName;
		this.cnpj = cnpj;
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

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
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
		return "LegalPerson [name=" + name + ", fantasyName=" + fantasyName + ", cnpj=" + cnpj + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + "]";
	}
	
}

package Entities;

import java.util.ArrayList;

public class Library {
	private LegalPerson legalPerson;
	private ArrayList<WorksOfArt> worksOfArt;
	
	public Library(LegalPerson legalPerson) {
		super();
		this.legalPerson = legalPerson;
		this.worksOfArt = new ArrayList<WorksOfArt>();
	}
	
	public LegalPerson getLegalPerson() {
		return legalPerson;
	}

	public void setLegalPerson(LegalPerson legalPerson) {
		this.legalPerson = legalPerson;
	}

	public ArrayList<WorksOfArt> getWorksOfArt() {
		return worksOfArt;
	}

	public boolean addWorkOfArt(WorksOfArt workOfArt) {
		return this.worksOfArt.add(workOfArt);
	}
	
	public boolean removeWorkOfArt(WorksOfArt workOfArt) {
		return this.worksOfArt.remove(workOfArt);
	}

	@Override
	public String toString() {
		return "Library [legalPerson=" + legalPerson + ", worksOfArt=" + worksOfArt + "]";
	}
	
}

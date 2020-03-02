package Entities;

public class Movies extends WorksOfArt {
	private String name;
	private String year;
	private Person director;
	private String description;
	private String category;
	
	public Movies(String name, String year, Person director, String description, String category) {
		super(true);
		this.name = name;
		this.year = year;
		this.director = director;
		this.description = description;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Person getDirector() {
		return director;
	}

	public void setDirector(Person director) {
		this.director = director;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movies [name=" + name + ", year=" + year + ", director=" + director + ", description=" + description
				+ ", category=" + category + "]";
	}	
}

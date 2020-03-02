package Entities;

public abstract class WorksOfArt {
	private boolean available;

	public WorksOfArt(boolean available) {
		super();
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public String toString() {
		return "WorksOfArt [available=" + available + "]";
	}

}
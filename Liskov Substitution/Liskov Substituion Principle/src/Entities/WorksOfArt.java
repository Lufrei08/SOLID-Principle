package Entities;

public abstract class WorksOfArt {
	private boolean available;
	private double lateFee;

	public WorksOfArt(boolean available, double lateFee) {
		super();
		this.available = available;
		this.lateFee = lateFee;
	}
	
	public WorksOfArt(boolean available) {
		super();
		this.available = available;
		this.lateFee = 10.00;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public double getLateFee() {
		return lateFee;
	}

	public void setLateFee(double lateFee) {
		this.lateFee = lateFee;
	}

	@Override
	public String toString() {
		return "WorksOfArt [available=" + available + ", lateFee=" + lateFee + "]";
	}

}

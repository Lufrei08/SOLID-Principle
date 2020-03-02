package Entities;


public class CyberCafe extends WorksOfArt{
	private int machine;
	private double hourValue;
	private double consumption;
	
	public CyberCafe(int machine, double hourValue) {
		super(true, 5.00);
		this.machine = machine;
		this.hourValue = hourValue;
		this.consumption = 0;
	}

	public int getMachine() {
		return machine;
	}

	public void setMachine(int machine) {
		this.machine = machine;
	}

	public double getHourValue() {
		return hourValue;
	}

	public void setHourValue(double hourValue) {
		this.hourValue = hourValue;
	}

	public double getConsumption() {
		return consumption;
	}

	public double calculateConsumption(double value)
	{
		this.consumption += value;
		return consumption;
		
	}

	@Override
	public String toString() {
		return "CyberCafe [machine=" + machine + ", hourValue=" + hourValue + ", consumption=" + consumption + "]";
	}
	
}

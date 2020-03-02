package entities;

public class Lamp {
	public boolean isOn;

	public Lamp() {
		super();
		this.isOn = false;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void trigger() {
		if (!this.isOn) {
			this.turnOn();
		} else {
			this.turnOff();
		}
	}

	public void turnOn() {
		this.isOn = true;
		System.out.println("Dispositivo Ligado!");
	}

	public void turnOff() {
		this.isOn = false;
		System.out.println("Dispositivo Desligado!");
	}
}

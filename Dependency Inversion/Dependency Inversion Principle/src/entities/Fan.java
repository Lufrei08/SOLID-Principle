package entities;

public class Fan implements IDevice {
	private boolean isOn;

	public boolean isOn() {
		return isOn;
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

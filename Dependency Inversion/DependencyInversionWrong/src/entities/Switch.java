package entities;

public class Switch {
	private Fan fan;
	private Lamp lamp;

	public Switch(Fan fan) {
		super();
		this.fan = fan;
	}

	public Switch(Lamp lamp) {
		super();
		this.lamp = lamp;
	}

	public void turnOnFan() {
		fan.trigger();
	}
	
	public void turnOnLamp()
	{
		lamp.trigger();
	}
}

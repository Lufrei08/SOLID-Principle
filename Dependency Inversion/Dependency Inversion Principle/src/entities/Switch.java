package entities;

public class Switch {
	private IDevice device;
	
	
	public Switch(IDevice device) {
		super();
		this.device = device;
	}


	public void turnOnDevice() {
		device.trigger();
	}
}

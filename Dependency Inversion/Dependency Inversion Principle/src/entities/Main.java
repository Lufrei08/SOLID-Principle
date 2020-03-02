package entities;

public class Main {

	public static void main(String[] args) {
		IDevice fan = new Fan();
		
		IDevice lamp = new Lamp();
		
		Switch swtch = new Switch(fan);
		
		Switch swtch2 = new Switch(lamp);
		
		swtch.turnOnDevice();
		swtch.turnOnDevice();
		swtch2.turnOnDevice();
		swtch2.turnOnDevice();

	}

}

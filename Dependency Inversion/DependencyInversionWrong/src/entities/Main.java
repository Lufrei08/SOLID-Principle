package entities;

public class Main {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		
		Lamp lamp2 = new Lamp();
		
		Switch swtch = new Switch(fan1);
		
		Switch swtch2 = new Switch(lamp2);
		
		swtch.turnOnFan();
		swtch.turnOnFan();
		swtch2.turnOnLamp();
		swtch2.turnOnLamp();

	}

}

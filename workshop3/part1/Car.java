public class Car 
{
	private String colour;
	private int enginePower;
	private boolean convertible;
	private boolean parkingBrake;

	public Car(){
		colour = "none";
		enginePower = 0;
		convertible = false;
		parkingBrake = false;
	}

	public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
		this.colour = colour;
		this.enginePower = enginePower;
		this.convertible = convertible;
		this.parkingBrake = parkingBrake;
	}

	public String getColour() {
		return this.colour;
	}

	public int getEnginePower() {
		return this.enginePower;
	}

	public boolean getConvertible() {
		return this.convertible;
	} 

	public boolean getParkingBrake() {
		return this.parkingBrake;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setEnginePower(int enginePower) {
		this.enginePower = enginePower;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public void setParkingBrake(boolean parkingBrake) {
		this.parkingBrake = parkingBrake;
	}

	public void pressStartButton() {
		System.out.println("You have pressed the start button");
	}

	public void pressAcceleratorButton() {
		System.out.println("You have pressed the accelerator button");
	}

	public void output() {
		System.out.format("{colour: %s, engine power: %d, convertible: %b, parking brake: %b}\n", 
			this.colour, this.enginePower, this.convertible, this.parkingBrake);
	}
}
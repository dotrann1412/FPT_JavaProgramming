package DTO;

public class Colony extends Organization
{
	protected String place;

	public Colony() {
		super();
		this.place = "unknown";
	}

	public Colony(int size, String place) {
		super(size);
		this.place = place;
	}

	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public void communicateByTool() {
		System.out.println("The colony communicate by sound");
	}

	public void grow() {
		System.out.println("An annual cycle of growth that begins in spring");
	}

	public void reproduce() {
		System.out.println("Colony can reproduce itself through a process");
	}

	public String toString() {
		return super.toString() + ", the colony's place is " + this.place;
	}
}
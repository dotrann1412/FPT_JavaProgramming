package DTO;

public class BeeColony extends Colony implements Role
{
	private String type;

	public BeeColony() {
		super();
		this.type = "unknown";
	}

	public BeeColony(int size, String place, String type) {
		super(size, place);
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String toString() {
		return "the colony's type is " + this.type + ", size is about " + this.size + ", and the place is " + this.place;
	}

	public void createWorker() {
		System.out.println("Worker bees perform all the work of the bees");
	}
}
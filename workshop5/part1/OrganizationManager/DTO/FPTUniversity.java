package DTO;

public class FPTUniversity extends University implements Role
{
	private String address;

	public FPTUniversity() {
		super();
		this.address = "unknown";
	}

	public FPTUniversity(int size, String name, String address) {
		super(size, name);
		this.address = address;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
	}

	public void createWorker() {
		System.out.println("Providing human resources");
	}
}
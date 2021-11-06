package DTO;

public class University extends Organization
{
	protected String name;

	public University() {
		this.name = "unknown";
	}

	public University(int size, String name) {
		super(size);
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void communicateByTool() {
		System.out.println("In the university, people communicate by voice");
	}

	public void enroll() {
		System.out.println("The registration for enrollment is only valid when the" + 
			" University has received all enrollment documents and enrollment fees");
	}

	public void educate() {
		System.out.println("Provide education at university standard");
	}

	public String toString() {
		return "Encourage the advancement and development of knowledge";
	}
}
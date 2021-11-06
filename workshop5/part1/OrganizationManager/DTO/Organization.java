package DTO;

public abstract class Organization
{
	protected int size;

	public Organization() {
		this.size = 0;
	}

	public Organization(int size) {
		this.size = size;
	}

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public abstract void communicateByTool();

	public String toString() {
		return "The organization's size is "  + this.size;
	}
}
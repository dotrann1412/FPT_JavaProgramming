package DTO;
import java.util.Scanner;

public class Item
{
	protected static int value;
	protected static String creator;

	public Item() {
		this.value = 0;
		this.creator = "none";
	}

	public Item(int value, String creator) {
		this.value = value;
		this.creator = creator;
	}

	public int getValue() {
		return this.value;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("Enter value (must be positive): ");
			this.value = scanner.nextInt();
		} while(this.value <= 0);

		do {
			System.out.print("Enter creator: ");
			scanner.nextLine();
			this.creator = scanner.nextLine();
		} while(this.creator.isEmpty());
	}

	public void output() {
		System.out.format("{value: %d; creator: %s}\n",
			this.value, this.creator);
	}
}
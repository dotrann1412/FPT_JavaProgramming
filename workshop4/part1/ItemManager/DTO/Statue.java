package DTO;
import java.util.Scanner;

public class Statue extends Item
{
	private int weight;
	private String colour;

	public Statue() {
		super();
		this.weight = 0;
		this.colour = "none";
	}

	public Statue(int value, String creator, 
		int weight, String colour) {
		super(value, creator);
		this.weight = weight;
		this.colour = colour;
	}

	public int getWeight() {
		return this.weight;
	}

	public String getColour() {
		return this.colour;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void outputStatue() {
		System.out.format("{value %d; creator: %s; weight: %d; colour: %s}\n",
			this.value, this.creator, this.weight, this.colour);
	}

	public void inputStatue() {
		Scanner scanner = new Scanner(System.in);

		super.input();

		do {
			System.out.print("Enter weight (must be positive): ");
			this.weight = scanner.nextInt();
		} while(this.weight <= 0);

		System.out.print("Enter color: ");
		scanner.nextLine();
		this.colour = scanner.nextLine();
	}
}
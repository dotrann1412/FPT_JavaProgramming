package DTO;
import java.util.Scanner;

public class Vase extends Item
{
	private int height;
	private String material;

	public Vase() {
		super();
		this.height = 0;
		this.material = "none";
	}

	public Vase(int value, String creator, 
		int height, String material) {
		super(value, creator);
		this.height = height;
		this.material = material;
	}

	public int getHeight() {
		return this.height;
	}

	public String getMaterial() {
		return this.material;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void outputVase() {
		System.out.format("{value: %d; creator: %s; height: %d; material: %s}\n",
			this.value, this.creator, this.height, this.material);
	}

	public void inputVase() {
		Scanner scanner = new Scanner(System.in);
		
		super.input();

		do{
			System.out.print("Enter height (must be positive): ");
			this.height = scanner.nextInt();
		} while(this.height <= 0);

		System.out.print("Enter material: ");
		scanner.nextLine();
		this.material = scanner.nextLine();
	}
}
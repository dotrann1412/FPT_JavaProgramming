package DTO;
import java.util.Scanner;

public class Painting extends Item
{
	private int height;
	private int width;
	private boolean _isWatercolour;
	private boolean _isFramed;

	public Painting() {
		super();
		this.height = 0;
		this.width = 0;
		this._isWatercolour = false;
		this._isFramed = false;
	}

	public Painting(int value, String creator,
		int height, int width, boolean isWatercolour, boolean isFramed) {
		super(value, creator);
		this.height = height;
		this.width = width;
		this._isWatercolour = isWatercolour;
		this._isFramed = isFramed;
	}

	public int getHeight() {
		return this.height;	
	}

	public int getWidth() {
		return this.width;
	}

	public boolean isWatercolour() {
		return this._isWatercolour;
	}

	public boolean isFramed() {
		return this._isFramed;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setWaterColor(boolean checkpts) {
		this._isWatercolour = checkpts;
	}

	public void setFramed(boolean checkpts) {
		this._isFramed = checkpts;
	}

	public void outputPainting() {
		System.out.format("{value: %d; creator: %s; height: %d; widtd: %d; water colour: %b; farmed: %b}\n",
			this.value, this.creator, this.height, this.width, this._isWatercolour, this._isFramed);
	}

	public void inputPainting() {
		Scanner scanner = new Scanner(System.in);

		super.input();

		do {
			System.out.print("Enter height (must be positive): ");
			this.height = scanner.nextInt();
		} while(this.height <= 0);

		do {
			System.out.print("Enter width (must be positive): ");
			this.width = scanner.nextInt();
		} while(this.width <= 0);

		int tmp;
		System.out.print("This painting is painted by water color? (1: yes; other: no): ");
		tmp = scanner.nextInt();
		if(tmp == 1) this._isWatercolour = true;
		else this._isWatercolour = false;
		
		System.out.print("Is this painting framed? (1: yes; other: no): ");
		tmp = scanner.nextInt();
		if(tmp == 1) this._isFramed = true;
		else this._isFramed = false;
	}
}
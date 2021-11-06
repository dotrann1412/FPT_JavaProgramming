import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
	private static Scanner scanner = null;

	static {
		scanner = new Scanner(System.in);
	}

	public static int getChoice(ArrayList options) {
		for(int i = 0; i < options.size(); ++i) {
			System.out.format("%d. %s\n", i + 1, options.get(i));
		}
		System.out.print("Enter your choice: ");
		return Integer.parseInt(scanner.nextLine());
	}  

	public static int getChoice(Object[] options) {
		for(int i = 0; i < options.length; ++i) {
			System.out.format("%d. %s\n", i + 1, options[i]);
		}
		System.out.print("Enter your choice: ");
		return Integer.parseInt(scanner.nextLine());
	}
}
import java.util.Scanner;

public class Inputter
{
	public static Scanner scanner = null;

	static {
		scanner = new Scanner(System.in);
	}

	public static int inputInt(String message, int offset, int limit) {
		int value;
		if(offset > limit) {
			System.out.println("Comparison Exception");
			System.exit(1);
		}

		do {
			System.out.format("%s from %d to %d: ", message, offset, limit);
			value = Integer.parseInt(scanner.nextLine());
		} while(value < offset || value > limit);
		return value;
	}

	public static String inputStr(String message) {
		System.out.print(message);
		return scanner.nextLine();
	}

	public static String inputNonBlankStr(String message) {
		String data = "";
		do {
			System.out.print(message);
			data = scanner.nextLine().trim();
		} while(data.length() == 0);
		return data;
	}

	public static String inputPattern(String message, String pattern) {
		String data = "";
		do {
			System.out.print(message);
			data = scanner.nextLine().trim();
		} while(!data.matches(pattern));
		return data;
	}
}
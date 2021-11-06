package MyLib;

import java.util.Scanner;

public class Inputter
{
	static Scanner scanner = null;

	static {
		scanner = new Scanner(System.in);
	}
	
	public static char nextChar(String message) {
		System.out.print(message);
		return scanner.nextLine().charAt(0);
	}

	public static int nextInt(String message) {
		System.out.print(message);
		return Integer.parseInt(scanner.nextLine());
	}

	public static int nextPositiveInt(String message) {
		int num = 0;
		do {
			System.out.print(message);
			num = Integer.parseInt(scanner.nextLine());
		} while(num <= 0);
		return num;
	}

	public static String nextNonEmptyString(String message) {
		String result = "";
		do {
			System.out.print(message);
			result = scanner.nextLine();
		} while(result.trim().length() == 0);
		return result;
	}

	public static String nextString(String pattern) {
		String result = "";
		do {
			result = nextNonEmptyString("Enter non empty string: ");
		} while(!result.trim().matches(pattern));
		return result;
	}
}
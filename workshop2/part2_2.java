import java.util.Scanner;

public class part2_2
{

	private String solve() throws Exception {
		Scanner scanner = new Scanner(System.in);

		String pattern = "SE\\d\\d\\d";
		System.out.print("Enter the string: ");
		String id = scanner.nextLine();

		if(!id.matches(pattern))
			throw new Exception();

		return id;
	}

	public static void main(String[] args) {
		part2_2 p2 = new part2_2();
		do {
			try {
				System.out.format("The string is %s\n" , p2.solve());
			} catch (Exception e) {
				System.out.println("The string is invalid");
			}
			break;
		} while(true);
	}
}
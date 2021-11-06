import java.util.Scanner;

public class part2
{
	private static void solve() {
		Scanner scanner = new Scanner(System.in);
		String pattern = "SE\\d\\d\\d";
		
		do {
			try {
				System.out.print("Enter the string: ");
				String id = scanner.nextLine();

				if(id.matches(pattern)) {
					System.out.format("The String is %s\n", id);
				} else throw new Exception();

				break;
			} catch (Exception e) {
				System.out.println("The string is invalid");
			}
		} while(true);
	}

	public static void main(String[] args) {
		part2.solve();
	}
}
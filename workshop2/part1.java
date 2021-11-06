import java.util.Scanner;

public class part1
{
	private static void solve() {
		Scanner scanner = new Scanner(System.in);
		do {
			try {
				System.out.print("Enter a number: ");
				//check if the input has more 1 word
				//if parse function is fail it throw exception
				String strnum = scanner.nextLine();
				int number = Integer.parseInt(strnum);
				if(number < 1) throw new Exception();
				System.out.format("The number is: %d\n", number);
				break;
			} catch (Exception e) {
				System.out.println("The number is invalid");
			}
		} while(true);
		scanner.close();
	}

	public static void main(String[] args) {
		part1.solve();
	}
}
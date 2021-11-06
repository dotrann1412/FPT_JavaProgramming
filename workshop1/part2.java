import java.util.Scanner;

public class part2 
{
	private static void solve() {
		float a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input the number 1: ");
		a = scanner.nextFloat();
		System.out.print("Input the number 2: ");
		b = scanner.nextFloat();
		System.out.print("Input the operator: ");
		char operator = scanner.next().charAt(0);

		float result = 0;

		if(operator == '+') result = a + b;
		else if(operator == '-') result = a - b;
		else if(operator == '*') result = a * b;
		else {
			if(b == 0) {
				System.out.print("Math error");
				return;
			}
			result = a / b;
		}

		System.out.format("The result of %.2f %c %.2f = %.2f", a, operator, b, result);
		scanner.close();
	}

	public static void main(String[] args) {
		part2.solve();
	}
}
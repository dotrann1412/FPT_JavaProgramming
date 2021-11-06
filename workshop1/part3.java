import java.util.Scanner;

public class part3
{
	private static void solve() {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of Students: ");
		n = scanner.nextInt();
		String[] students = new String[n];
		scanner.nextLine(); //to ignore '\n'
		for(int i = 0; i < n; ++i) {
			System.out.format("Enter name of student number %d: ", i + 1);
			students[i] = scanner.nextLine();
		}
		System.out.println("List of student");
		for(int i = 0; i < n; ++i) {
			System.out.format("Student %d: %s\n",i + 1 ,students[i].toUpperCase());
		}
		scanner.close();
	}

	public static void main(String[] args) {
		part3.solve();
	}
}
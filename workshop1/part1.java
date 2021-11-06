import java.util.Scanner;

public class part1
{
	private static void solve() {
		int n, m;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.format("Enter number of rows: ");
		n = scanner.nextInt();
		System.out.format("Enter number of columns: ");
		m = scanner.nextInt();
		int[][] array = new int[n][m];
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				System.out.format("m[%d][%d] = ", i, j);
				array[i][j] = scanner.nextInt();
				sum += array[i][j];
			}
		}
		System.out.println("Matrix inputted: ");
		for(int i = 0; i < n; ++i) {
			for(int j = 0; j < m; ++j) {
				System.out.format("%d ", array[i][j]);
			}
			System.out.println();
		}
		System.out.format("Sum: %d\n", sum);
		System.out.format("Average: %.3f", 1.0 * sum / (n * m));
		scanner.close();
	}

	public static void main(String[] args) {
		part1.solve();
	}
}
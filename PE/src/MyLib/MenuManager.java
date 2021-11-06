package MyLib;

public class MenuManager
{
	public static int getUserChoice(String[] options) {
		for(int i = 0; i < options.length; ++i) {
			System.out.format("%d. %s\n", i + 1, options[i]);
		}
		return Inputter.nextInt("Enter your choice: ");
	}
}
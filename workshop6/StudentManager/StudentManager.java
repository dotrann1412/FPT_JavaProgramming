public class StudentManager
{
	public static void main(String[] args) {
		String[] options = {"Add new tudent", "Search a student", "Update name and mark", "Remove a student", "List all", "Quit"};
		int choosed = 0;
		StudentList list = new StudentList();
		do {
			choosed = Menu.getChoice(options);
			if(choosed == 1) list.addStudent();
			else if(choosed == 2) list.searchStudent();
			else if(choosed == 3) list.updateStudent();
			else if(choosed == 4) list.removeStudent();
			else if(choosed == 5) list.printAll();
			else System.out.println("Bye!");
		} while(choosed > 0 && choosed < 6);
	}
}
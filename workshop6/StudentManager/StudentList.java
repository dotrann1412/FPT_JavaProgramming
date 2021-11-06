import java.util.ArrayList;

public class StudentList extends ArrayList<Student>
{
	public StudentList() {
		super();
	}

	public Student search(String code) {
		code = code.trim().toUpperCase();
		for(int i = 0; i < this.size(); ++i)
			if(this.get(i).getCode().equals(code)) return this.get(i);
		return null;
	}

	public void searchStudent() {
		if(this.isEmpty()) System.out.println("Empty list");
		else {
			String code = Inputter.inputStr("Enter student code to search: ");
			Student ostudent = search(code);
			if(ostudent == null) {
				System.out.format("Student with code %s does not existed\n", code);
			} else System.out.println("Found " + ostudent);
		}
	}

	private boolean isCodeDuplicate(String code) {
		code = code.trim().toUpperCase();
		return search(code) != null;
	}

	public void addStudent() {
		String code, name;
		int mark;
		do {
			code = Inputter.inputPattern("St. code S000: ", "[sS][\\d]{3}");
			if(!isCodeDuplicate(code)) break;
		} while(true);
		name = Inputter.inputNonBlankStr("Name of new Student: ");
		name = name.toUpperCase();
		mark = Inputter.inputInt("Enter mark ", 0, 10);
		this.add(new Student(code, name, mark));
		System.out.format("Student %s has been added\n", code);
	}

	public void updateStudent() {
		if(this.isEmpty()) System.out.println("Empty list. No update can be performed!");
		else {
			String code;
			code = Inputter.inputStr("Input code of updated student: ");
			Student ostudent = search(code);
			if(ostudent == null) {
				System.out.format("Student with code %s not found!\n", code); 
			} else {
				ostudent.setName(Inputter.inputNonBlankStr(String.format("Old name %s, new name: ", ostudent.getName())));
				ostudent.setMark(Inputter.inputInt(String.format("Old mark %d, enter new mark ", ostudent.getMark()), 0, 10));
				System.out.format("Student with code %s has been updated\n", code);
			}
		}
	}

	public void removeStudent() {
		if(this.isEmpty()) System.out.println("Empty list. Remove operation can not be performed");
		else {
			String code = Inputter.inputStr("Enter code of removed student: ");
			Student ostudent = search(code);
			if(ostudent == null) {
				System.out.format("Student with code %s not found\n", code);
			} else {
				this.remove(ostudent);
				System.out.format("The student with code %s has been removed\n", code);
			}
		}
	}

	public void printAll() {
		if(this.isEmpty()) System.out.println("Empty list!");
		else {
			System.out.println("Student list: ");
			for(Student student: this) {
				System.out.println(student);
			}
			System.out.format("Total: %d Student(s).\n", this.size());
		}
	}
}
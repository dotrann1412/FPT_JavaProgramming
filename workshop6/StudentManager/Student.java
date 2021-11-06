public class Student
{
	private String code;
	private int mark;
	private String name;

	public Student() {
		this.code = "unknown";
		this.name = "unknown";
		this.mark = 0;
	}

	public Student(String code, String name, int mark) {
		this.mark = mark;
		this.code = code.toUpperCase();
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public String getName() {
		return this.name;
	}

	public int getMark() {
		return this.mark;
	}

	public void setCode(String code) {
		this.code = code.toUpperCase();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String toString() {
		return String.format("{id: %s; name: %s; mark: %d}", 
			this.code, this.name, this.mark);
	}
}
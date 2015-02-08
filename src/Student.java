
public class Student implements Comparable<Student>{
	
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	
	public int compareTo(Student s) {
		if (s.score<score) {
			return -1;
		}
		if (s.score > score) {
			return 1;
		}
		return 0;
	}
	
	public String toString() {
		return name + " " + score;
	}
}

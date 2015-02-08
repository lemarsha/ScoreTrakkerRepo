import java.io.*;
import java.util.*;

public class ScoreTrakker {

	private ArrayList<Student> students;
	
	public void loadDataFromFile(String filename) {
		students = new ArrayList<Student>();
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(filename);
			in = new Scanner(reader);
		} catch (FileNotFoundException e) {
			System.out.println(e.getLocalizedMessage());
		}
		String name = null; //s gets line
		int score = 0;
		while(in.hasNext()) {
			name = in.next() + " " +in.next();
			score = Integer.parseInt(in.next());
			Student s = new Student(name, score);
			students.add(s);
		}
	}
	
	public void printInOrder() {
		students.sort(null);
		for (Student s: students) {
			System.out.println(s.toString());
		}
	}
	
	public void processFiles() {
		loadDataFromFile("scores.txt");
		printInOrder();
	}
	
	public static void main(String[] args) {
		ScoreTrakker k = new ScoreTrakker();
		k.processFiles();
	}
}

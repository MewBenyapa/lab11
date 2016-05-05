package student;

import java.util.List;

import java.util.function.Predicate;

/**
 * Display reminders of students having a birthday soon.
 * @author you
 */
public class StudentApp {

	/**
	 * Print the names (and birthdays) of students having a birtday in the
	 * specified month.
	 * @param students list of students
	 * @param month the month to use in selecting bithdays
	 */
	public void filterAndPrint( List<Student> students, Predicate<Student> filter ) {
		for(Student student : students ) {
			if (filter.test(student))
	                  System.out.println( student );
		}
	}
	
	public static void main(String[] args) {
		List<Student> students = Registrar.getInstance().getStudents();
		Predicate<Student> check = (student) -> student.getBirthdate().getDayOfMonth() == 1;
		StudentApp app = new StudentApp();
		app.filterAndPrint(students, check);
	}
}

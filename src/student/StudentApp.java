package student;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
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
	public void filterAndPrint( List<Student> students, Predicate<Student> filter, Consumer<Student> action , Comparator<Student> compare) {
		students.stream().filter(filter).sorted(compare).forEach(action);
	}
	
	public static void main(String[] args) {
		List<Student> students = Registrar.getInstance().getStudents();
		Predicate<Student> filter = (student) -> student.getBirthdate().getMonthValue() == 1;
		Consumer<Student> action = (student) -> System.out.printf("%s %s will have birthday on %d %s\n", student.getFirstname(), student.getLastname(), student.getBirthdate().getDayOfMonth(), student.getBirthdate().getMonth());
		//Comparator<Student> byName = (a, b) -> a.getFirstname().charAt(0) - b.getFirstname().charAt(0);
		Comparator<Student> byBirthday = (a, b) -> a.getBirthdate().getDayOfMonth() - b.getBirthdate().getDayOfMonth();
		StudentApp app = new StudentApp();
		app.filterAndPrint(students, filter, action, byBirthday);
	}
}

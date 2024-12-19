import models.Course;
import models.Professor;
import models.University;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        Course course2 = new Course();

        course1.setData("CS102", "Data Structures", 4);
        course2.setData("CS102", "Data Structures", 4);

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        professor1.setData("Dr. Alice", "Computer Science", 10);
        professor2.setData("Dr. Bob", "Mathematics", 8);

        University university = new University();
        university.addUniversity("Tech University");

        university.addCourse(course1);
        university.addCourse(course2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);

        university.displayUniversityDetails();

        System.out.println("\nComparing two courses:");
        System.out.println("models.Course 1 and models.Course 2 are " +
                (course1.getCourseCode().equals(course2.getCourseCode()) ? "the same" : "different"));
    }
}

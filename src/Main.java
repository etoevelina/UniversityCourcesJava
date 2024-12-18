public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("CS101", "Introduction to Programming", 3);
        Course course2 = new Course("CS102", "Data Structures", 4);

        Professor professor1 = new Professor("Dr. Alice", "Computer Science", 10);
        Professor professor2 = new Professor("Dr. Bob", "Mathematics", 8);

        University university = new University("Tech University");

        university.addCourse(course1);
        university.addCourse(course2);
        university.addProfessor(professor1);
        university.addProfessor(professor2);

        university.displayUniversityDetails();

        System.out.println("\nComparing two courses:");
        System.out.println("Course 1 and Course 2 are " +
                (course1.getCourseCode().equals(course2.getCourseCode()) ? "the same" : "different"));
    }
}

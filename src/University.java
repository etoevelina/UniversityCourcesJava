import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Course> courses;
    private ArrayList<Professor> professors;

    public University(String universityName) {
        this.universityName = universityName;
        this.courses = new ArrayList<>();
        this.professors = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void displayUniversityDetails() {
        System.out.println("University Name: " + universityName);
        System.out.println("Courses Offered:");
        for (Course course : courses) {
            course.displayCourseInfo();
        }
        System.out.println("Professors:");
        for (Professor professor : professors) {
            professor.displayProfessorInfo();
        }
    }
}

package models;

import java.util.ArrayList;

public class University {
    private String universityName;
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Professor> professors =  new ArrayList<>();

    public void addUniversity(String universityName) {
        this.universityName = universityName;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    public void displayUniversityDetails() {
        System.out.println("models.University Name: " + universityName);
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

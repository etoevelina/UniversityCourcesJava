package models;

public class Course {
    private String courseCode;
    private String courseName;
    private int credits;

    public void setData(String courseCode, String courseName, int credits) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    public void displayCourseInfo() {
        System.out.println("models.Course Code: " + courseCode + ", models.Course Name: " + courseName + ", Credits: " + credits);
    }
}

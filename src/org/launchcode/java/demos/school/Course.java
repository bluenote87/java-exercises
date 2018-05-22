package org.launchcode.java.demos.school;

import java.util.ArrayList;

public class Course {

    private final int courseId;
    private String courseName;
    private String courseDescription;
    private int courseCredits;
    private ArrayList<Student> theRoster = new ArrayList<>();

    public Course(int aCourseId, String aName, String aDescription, int creditsEarned, ArrayList<Student> newRoster) {
        this.courseId = aCourseId;
        this.courseName = aName;
        this.courseDescription = aDescription;
        this.courseCredits = creditsEarned;
        this.theRoster = newRoster;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getCourseDescription() {
        return courseDescription;
    }
    public int getCourseCredits() {
        return courseCredits;
    }
    public ArrayList<Student> getClassRoster() {
        return theRoster;
    }
    public void setCourseName(String aName) {
        courseName = aName;
    }
    public void setCourseDescription(String aDescription) {
        courseDescription = aDescription;
    }
    public void setCourseCredits(int theCredits) {
        courseCredits = theCredits;
    }
    public void setCourseRoster(ArrayList<Student> newRoster) {
        theRoster = newRoster;
    }
    public String toString() {
        return "Course " + courseId + ": " + courseName + "\n" + courseDescription +
                "\nThis course will earn the student " + courseCredits + " credits.";
    }
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o.getClass() != getClass()) {
            return false;
        }
        Course theCourse = (Course) o;
        return theCourse.courseId == getCourseId();
    }
}

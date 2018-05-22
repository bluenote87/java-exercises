package org.launchcode.java.demos.school;

public class Student {

    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;
    private static int nextStudentId = 1;

    public Student(String aName, int aStudentId, int theNumberOfCredits, double aGPA) {
        this.name = aName;
        this.studentId = aStudentId;
        this.numberOfCredits = theNumberOfCredits;
        this.gpa = aGPA;
    }
    public Student(String aName, int aStudentId) {
        this(aName, aStudentId, 0, 0);
    }
    public Student(String aName) {
        this(aName, nextStudentId);
        nextStudentId++;
    }
    public String getStudentName() {
        return name;
    }
    public int getStudentId() {
        return studentId;
    }
    public int getNumberOfCredits() {
        return numberOfCredits;
    }
    public double getGpa() {
        return gpa;
    }
    public void setStudentName(String aName) {
        name = aName;
    }
    public void setNumberOfCredits (int theNumberOfCredits) {
        numberOfCredits = theNumberOfCredits;
    }
    public void addGrade(int courseCredits, double grade) {
        double oldGrade = gpa * numberOfCredits;
        double newGrade = grade * courseCredits;
        numberOfCredits = numberOfCredits + courseCredits;
        gpa = (oldGrade + newGrade) / numberOfCredits;
    }
    public String getGradeLevel() {
        String studentGradeLevel;
        if (numberOfCredits < 30) {
            studentGradeLevel = "freshman";
        } else if (30 <= numberOfCredits && numberOfCredits < 60) {
            studentGradeLevel = "sophomore";
        } else if (60 <= numberOfCredits && numberOfCredits < 90) {
            studentGradeLevel = "junior";
        } else {
            studentGradeLevel = "senior";
        }
        return "This student's grade level is " + studentGradeLevel + ".";
    }
    public String toString() {
        return name + " (Credits: " + numberOfCredits + ", GPA: " + gpa + ")";
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
        Student theStudent = (Student) o;
        return theStudent.getStudentId() == getStudentId();
    }
}

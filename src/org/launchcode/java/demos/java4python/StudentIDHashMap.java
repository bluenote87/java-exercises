package org.launchcode.java.demos.java4python;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentIDHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter the student ID (or enter '0' to finish)");

        // Get student names and grades
        do {

            System.out.print("Student ID: ");
            newStudent = in.nextInt();
            in.nextLine();

            if (newStudent != 0) {

                System.out.println("Name associated with ID: ");
                String newName = in.nextLine();
                students.put(newStudent, newName);

                // Read in the new line before looping back
                //in.nextLine();
            }

        } while(newStudent != 0);

        // Print class roster
        System.out.println("\nClass roster:");
        int rosterSize = 0;

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.print(student.getKey());
            System.out.print(" (");
            System.out.print(student.getValue());
            System.out.print(")");
            System.out.print("\n");
            rosterSize++;
        }
        System.out.println("Total students: " + rosterSize);
    }
}

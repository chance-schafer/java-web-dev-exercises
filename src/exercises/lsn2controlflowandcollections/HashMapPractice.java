package exercises.lsn2controlflowandcollections;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class HashMapPractice {



    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String studentName;
        int studentId;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            System.out.println("Student Name: ");
            studentName = input.nextLine();

            if(!studentName.equals("")) {
                System.out.println("Student ID: ");
                studentId = input.nextInt();

                students.put(studentId, studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));

        input.close();

        System.out.println("\nClass Roster:");
        for(Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("Student ID: " + student.getKey() + " - Student Name: " + student.getValue());
        }

        System.out.println("Number of student's in roster: " + students.size());

    }
}

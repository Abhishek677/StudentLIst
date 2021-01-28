/*
 * This is a simple example of creating arrays of objects
 * 
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Student[] students = new Student[2];
        
        Scanner input = new Scanner(System.in);
        
        for(int i =0; i<students.length;i++)
        {
            System.out.print("Enter students name: ");
            String name = input.nextLine();
            Student student = new Student(name);
            
            students[i]=student;
        }
        System.out.println("Printing the students");
        
        String format = "the student name is %s\n";
        
        for(Student student: students)
        {
            System.out.printf(format, student.getName());
            
        }
        
        
    }
    }
    


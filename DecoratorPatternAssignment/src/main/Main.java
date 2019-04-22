package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        List<Student> sortedStudents = new ArrayList<>();
        List<Integer> sortSerial = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        Integer students;
        System.out.println("Enter number of students:");
        students = input.nextInt();
        input.nextLine();
        
        
        
        
        
        for(int i=1;i<=students;i++) {
        	System.out.println("Enter name,age,cgpa and session of student  "+i+":");
        	String name=input.nextLine();
            Integer age=input.nextInt();
            input.nextLine();
            Double cgpa=input.nextDouble();
            input.nextLine();
            String session=input.nextLine();
            sortedStudents.add(new Student(name,age,cgpa,session));
            
        }

        sortSerial.add(0);
        sortSerial.add(1);



        for(int i: sortSerial)
        {
            sortedStudents = new Sorting(sortedStudents, i).sort();
        }

        for(Student st : sortedStudents)
            System.out.println(st.toString());
        
        input.close();
    }
}

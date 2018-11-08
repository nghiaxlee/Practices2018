import java.util.Scanner;

import models.*;

public class MyMain
{
    public static void main(String args[])
    {
        /*
            Options:
            0 - Exit.
            1 - Add student.
            2 - Remove student.
            3 - Print the sorted list of students.
            4 - Check double attending.
        */

        Scanner sc = new Scanner(System.in);
        ArrayList<Classroom> classes = new ArrayList<>(2);
        int option = 0;
        System.out.println("Select from list:"
                            + "\n 0 - Exit."
                            + "\n 1 - Add student."
                            + "\n 2 - Remove student." 
                            + "\n 3 - Print the sorted list of students." 
                            + "\n 4 - Check double attending.");
        do
        {
            try
            {
                option = sc.nextInt();
            }
            catch (Exception e)
            {
                
            }
            switch (option)
            {
                case 0:
                    break;
                case 1:
                    Student student = new Student();
                    try
                    {
                        // Read classroom
                        // Read name
                        // Read family name
                        // Read neptun code
                    }
                    catch (Exception e)
                    {
                        
                    }
                    break;
                case 2:
                    // read neptun.
                    // classroom.removeStudent(neptun);
                    break;
                case 3:
                    // read classroom no.
                    // classroom.print();
                    break;
                case 4:
                    // read classroom no.
                    // classroom.checkCommonStudents(classes[]);
                    break;
                default:
                    System.out.println("Not an option.");
                    break;
            }
        }
        while (option != 0);
    }
}
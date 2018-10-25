import java.util.Scanner;

public class MyFirstMenu
{
    public static void main(String args[])
    {
        /*
            Options:
            0 - Exit
            1 - Say Hi
            2 - Say Bye
            3 - Add words
            4 - List words.
        */

        Scanner sc = new Scanner(System.in);
        int option = 0;
        System.out.println("Select from list: \n 0 - Exit \n 1 - Say Hi \n 2 - Say Bye \n");
        do
        {
            option = sc.nextInt();
            switch (option)
            {
                case 0:
                    break;
                case 1:
                    System.out.println("Hi");
                    break;
                case 2:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Not an option.");
                    break;
            }
        }
        while (option != 0);
    }
}
package unit1_fundamentals;

import java.util.Scanner;

public class UserInput1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the user");
        String name = sc.nextLine();
        System.out.printf("You entered: %s\n", name);
    }
}

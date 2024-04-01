//Name: Nishant Sankar Swain
//Section: 21
import java.util.Scanner;

public class Q28
{
    public static int calculateFactorial(int number)
    {
        if (number == 0) 
        {
            return 1; // Base case: factorial of 0 is 1
        } 
        else 
        {
            // Recursive case: calculate factorial recursively
            return number * calculateFactorial(number - 1);
        }
    }

    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Number:");
        int num = obj.nextInt();
        try 
        {
            int result = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + result);
        } 
        catch (StackOverflowError e)
        {
            System.out.println(e);
        }

        obj.close();
    }
}

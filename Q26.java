//Name: Nishant Sankar Swain
//Section: 21
class student 
{
    void method() throws MethodNotFoundException 
    {
        throw new MethodNotFoundException("Method not implemented");
    }
}

class MethodNotFoundException extends Exception 
{
    MethodNotFoundException(String s) 
    {
        super(s);
    }
}

public class Q26 
{
    public static void main(String[] args) throws ClassNotFoundException {
        try 
        {
            student obj = new student();
            try 
            {
                obj.method();
            } 
            catch (MethodNotFoundException e)
            {
                System.out.println("Method not found: " + e);
            }
        } 
        finally 
        {
            System.out.println("Thank You!");
        }
    }
}

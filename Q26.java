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
        student obj = new student();
        try 
        {
            Class.forName("student");
            try 
            {
                obj.method();
            } 
            catch (MethodNotFoundException e)
            {
                System.out.println("Method not found: " + e);
            }
        } 
            catch(ClassNotFoundException e)
            {
                System.out.println("Class not found: " + e);
            }
        finally 
        {
            System.err.println("Thank You!");
        }
    }
}

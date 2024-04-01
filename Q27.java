//Name: Nishant Sankar Swain
//Section: 21
public class Q27 
{
    public static void main(String[] args)
    {
        try 
        {
            Object obj = new Object();
            String str = (String)obj;
            System.out.println("Successfully casted: " + str);
        }
        catch (ClassCastException e)
        {
            System.out.println(e);
        }
    }
}

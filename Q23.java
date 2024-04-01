//Name: Nishant Sankar Swain
//Section: 21
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
public class Q23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
		System.out.println("Copy and Paste the Path of File from the Directory:");
		String s=obj.nextLine();
		File f=new File(s);
		try
		{
			if(f.createNewFile())
			{
				System.out.println("File "+ f.getName()+" Created Sucessfully...");
			}
			else
			{
				System.out.println("File already exist in the directory..");
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			e.printStackTrace(); 
		}
		obj.close();
		
	}

}

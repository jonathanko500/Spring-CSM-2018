import java.util.*;
import java.io.*;

public class M9Prac 
{//start class

	public static void main(String[] args) throws IOException 
	{
		readNumbersOutputToFile();
	}
	public static void readNumbersOutputToFile() throws IOException
	{
		int n1,n2,n3;
		String fileName;
		Scanner input = new Scanner(System.in);
		
		File out = null;
		
		try
		{
			System.out.println("Enter three numbers");
			System.out.print("Number 1: ");
			n1 = Integer.parseInt(input.nextLine());
			System.out.print("Number 2: ");
			n2 = Integer.parseInt(input.nextLine());
			System.out.print("Number 3: ");
			n3 = Integer.parseInt(input.nextLine());
			System.out.print("What do you want to call the file: ");
			fileName=input.nextLine();
			out= new File(fileName+".txt");
			
			PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter(out)));
			output.print(n1+" "+n2+" "+n3);
			output.close();
		}
		catch (InputMismatchException a)
		{
			System.out.println("One of the values you entered was not a number.");
		}
	}
}//end class

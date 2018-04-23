import java.io.*;
import java.util.*;

public class Hangman {
	private static String Word;
	private static String blank;
	public static void main(String[] args) 
	{
		
		ArrayList<String> word = new ArrayList<String>();
		Word = getWord(word);
		blank=blankWord(getWord(word));
		System.out.println(Word);
		System.out.println(blank);
	}
	public static String getWord(ArrayList list) 
	{//start method
		Scanner fileScan = null;
		String x;
		try
		{
			fileScan = new Scanner(new FileReader(new File("words.txt")));
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
			System.out.println("There is not file.");
		}
		finally
		{
			String word;
			while(fileScan.hasNext())
			{
				word=fileScan.nextLine();
				list.add(word);
			}
		}
		int z;
		Random rand = new Random();
		z=rand.nextInt(list.size());
		return (String) list.get(z);
	}//end method
	public static String blankWord(String word)
	{
		int length=word.length();
		String x = "";
		for(int i=0;i<length;i++)
		{
			x+="*";
		}
		return x;
	}
	
}

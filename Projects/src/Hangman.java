import java.io.*;
import java.util.*;

public class Hangman {
	private static String word;
	private static String blank;
	private static int count=0;
	public static void main(String[] args) 
	{
		ArrayList<String> dic = new ArrayList<String>();
		word = getWord(dic);
		hang();
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
			System.out.println("There is no file.");
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
	public static void hang()
	{//start
		Scanner input = new Scanner(System.in);
		String letter;
		blank=blankWord(word);
		System.out.println("You need to guess this word: "+blankWord(word));
		System.out.println("You have 7 tries to guess the word.");
		while(count<7)
		{
			System.out.println("");
			System.out.println("This is your progress: "+blank);
			System.out.print("What is your guess: ");
			letter=input.nextLine();
			attempt(letter);
		}
		if(blank.contains("*"))
		{
			System.out.println("");
			System.out.println("The word is "+word);
		}
	}//end
	public static void attempt(String guess)
	{//start
		String noBlank="";
		guess.toLowerCase();
		for(int i=0;i<word.length();i++)
		{//loop
			if(word.charAt(i) == guess.charAt(0))//try-catch
			{
				noBlank+=guess.charAt(0);
			}
			else if(blank.charAt(i) != '*')
			{
				noBlank+=word.charAt(i);
			}
			else
			{
				noBlank+="*";
			}
		}//loop
		if(blank.equals(noBlank))
		{
			count++;
			System.out.println("That was guess number "+count);
		}
		else
		{
			blank=noBlank;
		}
		if(blank.equals(word))
		{
			System.out.println("You guess correctly. The word is indeed "+word+"!");
			count=8;
		}
		
	}//end
}
import java.io.*;
import java.util.*;

public class Hangman {

	public static void main(String[] args)// throws FileNotFoundException 
	{
		ArrayList<String> word = new ArrayList<String>();
		System.out.println(readDic(word));
		guessWord(readDic(word));
		

	}
	public static String readDic(ArrayList list) 
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
	public static void guessWord(String word)
	{//start method
		Scanner input = new Scanner(System.in);
		String guess;
		int numbGuess=7;
		System.out.println("The word you need to guess is "+word.length()+" letters long.");
		System.out.println("You have "+numbGuess+" guesses to figure out the word.");
		/*
		System.out.print("This is your word: ");
		for(int i=0;i<word.length();i++)
		{
			System.out.println("");
			
		}
		*/
		//guesses
		System.out.print("What is your guess: ");
		guess=input.nextLine();
		for(int i=0;i<6;i++)
		{
			if(word.contains(guess))
			{
				System.out.println("That is a CORRECT guess.");
				System.out.println("");
			}
			else
			{
				System.out.println("That is a WRONG guess.");
				System.out.println("");
			}
			numbGuess--;
			System.out.println("You have "+numbGuess+" guesses left.");
			System.out.print("What is your next guess: ");
			guess=input.nextLine();
		}
		
	}//end method
}

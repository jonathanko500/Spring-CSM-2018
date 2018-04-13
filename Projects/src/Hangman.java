import java.io.*;
import java.util.*;

public class Hangman {

	public static void main(String[] args) throws FileNotFoundException 
	{
		readDic();
		

	}
	public static void readDic() throws FileNotFoundException
	{//start method
		Scanner fileScan = new Scanner(new FileReader(new File("words.txt")));
		String[] dic = null;
		String word;
		int x=0,y;
		Random rand = new Random();
		while(fileScan.hasNext())
		{
			word=fileScan.nextLine();
			dic[x]=word;
			x++;
		}
	}//end method
}

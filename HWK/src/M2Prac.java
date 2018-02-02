//converting array of strings to array of string all upper case
public class M2Prac 
{//start class

	public static void main(String[] args) 
	{//start main
		String[] list = new String[]{"hello","bye"};
		convertToUpper(list);
	}//end main
	public static void convertToUpper(String[] words)
	{
		for(int i=0;i<words.length;i++)
		{
			words[i]=words[i].toUpperCase();
			System.out.println(words[i]);
		}
	}
}//end class

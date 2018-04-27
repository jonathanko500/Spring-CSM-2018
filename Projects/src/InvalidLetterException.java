//hangman
public class InvalidLetterException extends Exception
{
	public InvalidLetterException ()
	{
		super ("Invalid amount of letters. Only input one letter");
	}
}

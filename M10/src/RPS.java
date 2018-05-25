import java.util.*;


public class RPS 
{//start
	private int UWin, CWin, Tie;
	private final static int DEFAULT_NUMB = 0;
	private Moves CompChoice;
	//constructor
	public RPS()
	{
		UWin=DEFAULT_NUMB;
		CWin=DEFAULT_NUMB;
		Tie=DEFAULT_NUMB;
	}
	//setter
	public void setUWin(int x)
	{
		UWin=x;
	}
	public void setCWin(int x)
	{
		CWin=x;
	}
	public void setTie(int x)
	{
		Tie=x;
	}
	//getter
	public int getUWin()
	{
		return UWin;
	}
	public int getCWin()
	{
		return CWin;
	}
	public int getTie()
	{
		return Tie;
	}
	//outcomes/moves
	static enum Moves
	{
		ROCK,PAPER,SCISSORS;
	}
	static enum Outcome
	{
		COMP_WIN,USER_WIN,TIE;
	}
	//methods
	public static Moves generateCompuetrPlay()
	{
		Random rand = new Random();
		Moves CompMove = Moves.values()[rand.nextInt(Moves.values().length)];
		return CompMove;
	}
	public static Outcome findWinner(Moves x, Moves y)
	{//START
		Random rand = new Random();
		Moves user,compChoice;
		user=Moves.values()[rand.nextInt(Moves.values().length)];
		compChoice=generateCompuetrPlay();
		//USER ROCK
		if(user==Moves.ROCK&&compChoice==Moves.ROCK)
		{
			return Outcome.TIE;
		}
		else if(user==Moves.ROCK&&compChoice==Moves.PAPER)
		{
			return Outcome.COMP_WIN;
		}
		else if(user==Moves.ROCK&&compChoice==Moves.SCISSORS)
		{
			return Outcome.USER_WIN;
		}
		//USER PAPER
		else if(user==Moves.PAPER&&compChoice==Moves.SCISSORS)
		{
			return Outcome.COMP_WIN;
		}
		else if(user==Moves.PAPER&&compChoice==Moves.ROCK)
		{
			return Outcome.USER_WIN;
		}
		else if(user==Moves.PAPER&&compChoice==Moves.PAPER)
		{
			return Outcome.TIE;
		}
		//USER SCISSORS
		else if(user==Moves.SCISSORS&&compChoice==Moves.SCISSORS)
		{
			return Outcome.TIE;
		}
		else if(user==Moves.SCISSORS&&compChoice==Moves.PAPER)
		{
			return Outcome.USER_WIN;
		}
		else//USER=SCISSORS AND COMP=ROCK
		{
			return Outcome.COMP_WIN;
		}
	}//END	
}//end

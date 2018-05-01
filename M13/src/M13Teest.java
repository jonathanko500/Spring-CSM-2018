
public class M13Teest {

	public static void main(String[] args) 
	{
		System.out.println(populationSize(10,0.5,5));
	}
	//25
	public static void printMultiples(int[] nums, int multipleNumber)
	{//start
		printMultiplesH(nums,multipleNumber,0,nums.length-1);
	}//end
	private static void printMultiplesH(int[] nums, int multipleNumber, int first ,int last)
	{//start
		if(first==last)
		{
			if((nums[first]%multipleNumber)==0)
			{
				System.out.println(nums[first]);
			}
		}
		else
		{
			if((nums[first]%multipleNumber)==0)
			{
				System.out.println(nums[first]);
			}
			printMultiplesH(nums,multipleNumber,first+1,last);
		}
	}//end
	//26
	public static String reverseString(String originalString)
	{//start
		String x=reverseStringH(originalString,0,originalString.length()-1);
		return x;
	}//end
	private static String reverseStringH(String originalString, int begin,int end)
	{//start
		String x="";
		if(begin==end)
		{
			x+=originalString.charAt(end);
		}
		else
		{
			x+=originalString.charAt(end)+reverseStringH(originalString, begin,end-1);
			
		}
		return x;
	}//end
	//27
	public static int populationSize(int startingPopulation, double increaseRate, int numberOfDays)
	{
		int total=populationSizeH(startingPopulation,increaseRate,numberOfDays,0,numberOfDays-1);
		return total;
	}
	public static int populationSizeH(int startingPopulation, double increaseRate, int numberOfDays, int first, int last)
	{
		int total = 0;
		if(first==last)
		{
			total+=(int) (startingPopulation+(startingPopulation*increaseRate));
		}
		else
		{
			total+=(int) (startingPopulation+(startingPopulation*increaseRate))+populationSizeH(startingPopulation,increaseRate,numberOfDays,first=1,last);
		}
		return total;
	}
}

public class M13Teest {

	public static void main(String[] args) 
	{
		System.out.println(populationSize(10,1-0.5,4+1));
	}
	//25
	public static void printMultiples(int[] nums, int multipleNumber)
	{//start
		printMultiplesH(nums,multipleNumber,0,nums.length-1);
	}//end
	private static void printMultiplesH(int[] nums, int multipleNumber, int first ,int last)
	{//start
		if(first==last)
		{//base
			if((nums[first]%multipleNumber)==0)
			{
				System.out.println(nums[first]);
			}
		}
		else
		{//recursive
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
		{//base
			x+=originalString.charAt(end);
		}
		else
		{//recursive
			x+=originalString.charAt(end)+reverseStringH(originalString, begin,end-1);
			
		}
		return x;
	}//end
	//27
	public static int populationSize(int startingPopulation, double increaseRate, int numberOfDays)
	{//start
		int total=populationSizeH(startingPopulation,increaseRate,numberOfDays,0,numberOfDays-1);
		return total;
	}//end
	public static int populationSizeH(int startingPopulation, double increaseRate, int numberOfDays, int first, int last)
	{//start
		int total=0,pop;
		pop=(int) (startingPopulation+(startingPopulation*increaseRate));
		if(first==last)
		{//base
			total+=pop;
		}
		else
		{//recursive
			total+=pop+populationSizeH(startingPopulation,increaseRate,numberOfDays,first+1,last);
			
		}
		return total;
	}//end
}

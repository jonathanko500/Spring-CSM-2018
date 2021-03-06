import java.util.Scanner;
//Jonathan Ko
//CIS 255 Project 1 Rainfall
//worked with Kennedy Louie
public class Rainfall
{//start class
	public static void main(String[] args)
	{//start main
		double[] Values = new double[12];
		String option,choice;
		int pass=0;
		boolean again=true;
		enter(Values);
		Scanner input = new Scanner(System.in);
		do
		{//start loop
			option=menu();
			System.out.println("");
			do
			{//start loop
				
				switch(option)
				{//start switch
				case "all":
					printAll(Values);
					pass=1;
					break;
				case "total":
					printTotal(Values);
					pass=1;
					break;
				case "avg":
					printAvg(Values);
					pass=1;
					break;
				case "max":
					printMax(Values);
					pass=1;
					break;
				case "min":
					printMin(Values);
					pass=1;
					break;
				case "update":
					Values=update(Values);
					pass=1;
					break;
				default:
					System.out.print("Invalid data. re-enter: ");
					option=input.nextLine().toLowerCase();
					System.out.println("");
					break;
				}//end switch
			}while(pass==0);//end loop
			System.out.print("Again? (Y/N): ");
			choice=input.nextLine();
			System.out.println("");
			if(choice.equalsIgnoreCase("n"))
			{
				again=false;
			}
		}while(again==true);//end loop
		System.out.println("Code completed by Jonathan Ko and Kennedy Louie");
	}//end main
	public static void enter (double[] list)//enter data values
	{//start method
		double value;
		String[] months = new String[] {"January","February","March","April","May","June","July","August","September","October","November","December"};
		Scanner input = new Scanner(System.in);
		for(int i= 0;i<list.length;i++)
		{//start for
			System.out.print("Enter amount of rainfall for the month of "+months[i]+": ");
			value=Double.parseDouble(input.nextLine());
			while(value<0)
			{
				System.out.print("invalid data. Enter again that is more than 0: ");
				value=Double.parseDouble(input.nextLine());
			}
			list[i]=value;
		}//end for
		System.out.println("");
	}//end method
	public static String menu()// update data
	{//start method
		String choice="";
		Scanner input = new Scanner(System.in);
		System.out.println("Type \"All\" to see all the data. ");
		System.out.println("Type \"Total\" for total rainfall for the year.");
		System.out.println("Type \"Avg\" for average rainfall.");
		System.out.println("Type \"Max\" to see the month with the most rain.");
		System.out.println("Type \"Min\" to see the month with the least rain.");
		System.out.println("Type \"Update\" to update data.");
		System.out.print("What would you like to do? Enter: ");
		choice=input.nextLine();
		choice.toLowerCase();
		return choice;
	}//end method
	public static void printAll (double[] list)//prints all value
	{//start method
		for(int i=0;i<list.length;i++)
		{//start loop
			switch(i)
			{//start switch
			case 0:
				System.out.print("Jan. ");
				break;
			case 1:
				System.out.print("Feb. ");
				break;
			case 2:
				System.out.print("Mar. ");
				break;
			case 3:
				System.out.print("Apr. ");
				break;
			case 4:
				System.out.print("May. ");
				break;
			case 5:
				System.out.print("Jun. ");
				break;
			case 6:
				System.out.print("Jul. ");
				break;
			case 7:
				System.out.print("Aug. ");
				break;
			case 8:
				System.out.print("Sep. ");
				break;
			case 9:
				System.out.print("Oct. ");
				break;
			case 10:
				System.out.print("Nov. ");
				break;
			case 11:
				System.out.print("Dec. ");
				break;
			}//end switch
			System.out.printf("rainfall is %.2f%n",list[i]);
		}//end loop
		System.out.println("");
	}//end method
	public static void printTotal(double[] list)//print total rainfall
	{//start method
		double total=0;
		for(int i=0;i<list.length;i++)
		{
			total+=list[i];
		}
		System.out.printf("The total rainfall is %.2f%n",total);
		System.out.println("");
	}//end method
	public static void printAvg(double[] list)//print avg rainfall
	{//start method
		double total=0,avg=0;
		for(int i=0;i<list.length;i++)
		{
			total+=list[i];
		}
		avg=total/list.length;
		System.out.printf("The average rainfall is %.2f%n",avg);
		System.out.println("");
	}//end method
	public static void printMax (double[] list)//print max month rainfall
	{//start method
		double max=0;
		int monthNumb;
		String month="";
		for(int i=0;i<list.length;i++)
		{//start loop
			if(max<list[i])
			{//start if
				max=list[i];
				monthNumb=i;
				switch(monthNumb)
				{//start switch
				case 0:
					month="Jan.";
					break;
				case 1:
					month="Feb. ";
					break;
				case 2:
					month="Mar. ";
					break;
				case 3:
					month="Apr. ";
					break;
				case 4:
					month="May. ";
					break;
				case 5:
					month="Jun. ";
					break;
				case 6:
					month="Jul. ";
					break;
				case 7:
					month="Aug. ";
					break;
				case 8:
					month="Sept. ";
					break;
				case 9:
					month="Oct. ";
					break;
				case 10:
					month="Nov. ";
					break;
				case 11:
					month="Dec. ";
					break;
				}//end switch
			}//end if
		}//end loop
		System.out.printf("The month with the most amount of rain is "+month+"with %.2f%n",max);
		System.out.println("");
	}//end method
	public static void printMin (double[] list)//print max month rainfall
	{//start method
		double min=100000000;
		int monthNumb;
		String month="";
		for(int i=0;i<list.length;i++)
		{//start loop
			if(list[i]<min)
			{//start if
				min=list[i];
				monthNumb=i;
				switch(monthNumb)
				{//start switch
				case 0:
					month="Jan. ";
					break;
				case 1:
					month="Feb. ";
					break;
				case 2:
					month="Mar. ";
					break;
				case 3:
					month="Apr. ";
					break;
				case 4:
					month="May. ";
					break;
				case 5:
					month="Jun. ";
					break;
				case 6:
					month="Jul. ";
					break;
				case 7:
					month="Aug. ";
					break;
				case 8:
					month="Sept. ";
					break;
				case 9:
					month="Oct. ";
					break;
				case 10:
					month="Nov. ";
					break;
				case 11:
					month="Dec. ";
					break;
				}//end switch
			}//end if
		}//end loop
		System.out.printf("The month with the least amount of rain is "+month+"with %.2f%n",min);
		System.out.println("");
	}//end method
	public static double[] update (double[] list)//update array
    {//start method
        Scanner input = new Scanner(System.in);
        String month;
        double amount;
        int monthNumb=0,pass=0;
        System.out.print("Enter which month to change (Enter full month): ");
        month=input.nextLine();
        month.toLowerCase();
        do
        {
        	switch(month)
            {//start switch
            case "janurary":
                monthNumb=0;
                break;
            case "feburary":
                monthNumb=1;
                break;
            case "march":
                monthNumb=2;
                break;
            case "april ":
                monthNumb=3;
                break;
            case "may":
                monthNumb=4;
                break;
            case "june":
                monthNumb=5;
                break;
            case "july":
                monthNumb=6;
                break;
            case "august":
                monthNumb=7;
                break;
            case "september":
                monthNumb=8;
                break;
            case "october":
                monthNumb=9;
                break;
            case "november":
                monthNumb=10;
                break;
            case "december":
                monthNumb=11;
                break;
            default:
    			System.out.print("Invalid data. re-enter correct month (Enter full month): ");
    			month=input.nextLine().toLowerCase();
    			if(month.equalsIgnoreCase("january")||month.equalsIgnoreCase("february")||month.equalsIgnoreCase("march")||month.equalsIgnoreCase("april")||month.equalsIgnoreCase("june")||month.equalsIgnoreCase("july")||month.equalsIgnoreCase("august")||month.equalsIgnoreCase("september")||month.equalsIgnoreCase("october")||month.equalsIgnoreCase("november")||month.equalsIgnoreCase("december"))
    			{
    				pass=1;
    			}
    			break;
            }//end switch
        	pass=1;
        }while(pass==0);
        System.out.print("What is the new amount: ");
        amount=Double.parseDouble(input.nextLine());
        while(amount<0)
        {
            System.out.print("invalid data. Enter again that is more than 0: ");
            amount=Double.parseDouble(input.nextLine());
        }
        for(int i=0;i<list.length;i++)
        {
        	if(list[i]==list[monthNumb])
        	{
        		list[monthNumb]=amount;
        	}
        	
        }
        System.out.println("Data has been updated.");
        System.out.println("");
        return list;
    }//end method
}//end class
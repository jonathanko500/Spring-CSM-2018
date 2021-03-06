
public class M14Test
{

	public static void main(String[] args) 
	{
		Comparable[] a ={2, 3, 7, 8, 10};
		System.out.println(binarySearch(a,3));
	}
	public static int binarySearch(Comparable[] objects, Comparable target)
	{//start
		int first=0,last=objects.length-1;
		int loc=binarySearchH(objects,target,first,last);
		return loc;
	}//end
	public static int binarySearchH(Comparable[] objects, Comparable target,int first,int last)
	{//start
		int mid=(first+last)/2;
		if(objects[mid].equals(target))
		{
			return mid;
		}
		else if(objects[mid].compareTo(target)<mid)
		{
			return binarySearchH(objects,target,objects[mid].compareTo(target),last);
		}
		else
		{
			return binarySearchH(objects,target,first,objects[mid].compareTo(target));
		}
	}//end
}

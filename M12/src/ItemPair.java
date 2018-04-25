import java.util.*;

public class ItemPair<T>
{//start
	private ArrayList<T> list;
	//constructor
	public ItemPair()
	{
		list=new ArrayList<T>(2);
	}
	public ItemPair(T x, T y)
	{
		list.add(x);
		list.add(y);
	}
	//setter
	public void setItemPair(T x)
	{
		list.add(x);
	}
	//getter
	public ArrayList getItemPair()
	{
		return list;
	}
	@Override
	public boolean equals(Object x)
	{//start method
		if(x instanceof ItemPair)
		{//start instance
			ItemPair item = (ItemPair) x;
			if(getItemPair()==item.getItemPair())
			{//start comparison of two obj
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}//end instance
	}//end method
}//end

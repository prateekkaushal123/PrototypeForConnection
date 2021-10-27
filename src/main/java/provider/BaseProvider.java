package provider;

import java.util.Vector;

public abstract class BaseProvider {
	
	public int provide(Vector<Integer> v)
	{
		int sum=0;
		
		for(int i:v)
		{
			sum+=determineConnection(i);
		}
		
		return sum;
	}
	
	public boolean additionalLineItemDetermineConnection(int a)
	{
		return true;
	}
	public int determineConnection(int a)
	{
		if(a<5)
			return 0;
		
		if(!additionalLineItemDetermineConnection(a))
			return 0;
		
		
		return connection(a);
	}
	public abstract int connection(int a);

}

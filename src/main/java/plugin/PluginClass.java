package plugin;
import java.io.*;
import java.util.*;

import provider.ProviderClass;

public class PluginClass{
	public static void main(String args[])
	{
		Vector<Integer> v = new Vector<Integer>(10);
		
		for(int i=1;i<=10;i++)
			v.add(i);
		
		Map<Integer,String> map=new HashMap<Integer,String>();  
	    
	    map.put(1,"Amit");  
	    map.put(2,"Amit");  

	    map.put(7,"Amit");  
	    map.put(8,"Jai");  
	    map.put(6,"Amit");
	    
	    
	    
	    ProviderClass provider=new ProviderClass();
	    provider.setMap(map);
	    
	    System.out.println("Sum of all numbers greater than 5 and having mappped to Amit are: "+provider.provide(v));
		
			
	}

}

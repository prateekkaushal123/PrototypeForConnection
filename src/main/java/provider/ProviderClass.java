package provider;

import java.util.HashMap;
import java.util.Map;

public class ProviderClass extends BaseProvider {

	private Map<Integer,String> map=new HashMap<Integer,String>();
	
	public void setMap(Map<Integer,String> map)
	{
		this.map=map;
	}
	
	@Override
	public boolean additionalLineItemDetermineConnection(int a)
	{
		
		if(map.containsKey(a) && map.get(a).equals("Amit"))
		return true;
		
		return false;
	}

	@Override
	public int connection(int a) {
		
		return 2*a;
	}

}

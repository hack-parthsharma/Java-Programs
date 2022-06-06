import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KeysSetExample 
{

	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<>();
N		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Four");
		Map<String,Integer> map=new HashMap<>();
        for(String s:list)
        {
        	if(map.containsKey(s))
        	{
        		map.put(s, map.get(s)+1);
        	}else
        	{
        		map.put(s,1);
        	}
        
        }
        System.out.println(map.size());
        Set<String> set=map.keySet();
        for(String ss:set)
        {
        	System.out.println(ss);
        }
	}

}

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		 Map<Integer,String> m=new HashMap<Integer,String>();//map syntax
		 m.put(1, "sdfsd");//insert the element
		 m.put(2,"aqwes");
		 m.put(3, "azcdf");
		 
		  
		for(Map.Entry k:m.entrySet())//iterating the element
		{
			System.out.println(k.getKey()+" "+k.getValue());
		}
		System.out.println(m.remove(2));//remove the particular key
		System.out.println(m.get(1));//get the key to value
		System.out.println(m.containsKey(2));//it check whether the element is not 
		
	

	for(Integer d:m.keySet())//only it fetch the key values
	{
		System.out.println(d);
	}
	}
}

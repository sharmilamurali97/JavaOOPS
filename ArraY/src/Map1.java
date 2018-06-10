import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		 Map<Integer,String> m=new HashMap<Integer,String>();
		 m.put(1, "sdfsd");
		 m.put(2,"aqwes");
		 m.put(3, "azcdf");
		 
		 
		 Map s=new HashMap();
		 s.put(4,"sharmi");
		 s.put(5, "sdfsd");
		 s.put(6,"azcdf");
		 
		 
		 m.putAll(s);
		 
		for(Map.Entry k:m.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue());
		}
		 		

	}

}

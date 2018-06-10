import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		TreeMap<Integer,String>m=new TreeMap<Integer,String>();
		
		//m.put(null, "Sharmila"); //null key is not allowed
		m.put(0, "Swetha");
		m.put(1,null); // null value is allowed
		m.put(2, "Sachin");
		m.put(3, "Srilekha");
		
		for(Entry<Integer, String> k:m.entrySet())
		{
			System.out.println(k.getKey()+" "+k.getValue()); //Maintains Ascending order
		}
		System.out.println(m.firstKey());
		System.out.println(m.lastKey());
		System.out.println(m.containsKey(4));
		System.out.println(m.containsValue("perumal"));
		

	}

}

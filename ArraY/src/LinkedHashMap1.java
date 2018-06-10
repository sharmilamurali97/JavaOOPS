import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Double> m=new LinkedHashMap<Integer,Double>();//Syntax
		
		m.put(null, null);//1 null key and multiple null values
        m.put(2, 1.5);
        m.put(3, 3.5);
        m.put(4, 4.5);
        
        for(Map.Entry<Integer,Double>k:m.entrySet()) 
        {
        	System.out.println(k.getKey()+" "+k.getValue());//maintains insertion order
        }
	}

}

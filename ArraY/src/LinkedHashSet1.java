import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet m=new LinkedHashSet();
		
		m.add(10);//it maintain the insertion order and not allow the duplicate elements
		m.add(12);
		m.add(15);
		m.add(20);
		m.add(15);
		m.add(null);//it allow the null elements
		
		Iterator itr =m.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

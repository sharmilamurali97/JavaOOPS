import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
	TreeSet m=new TreeSet();	
	m.add(23);
	m.add(11);
	m.add(45);
	m.add(21);
	
	
	Iterator itr=m.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println(m.first());	
	System.out.println(m.last());
}

}

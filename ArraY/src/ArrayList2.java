import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {

	public static void main(String[] args) {
		ArrayList m =new ArrayList();
		m.add("sharmi");
		m.add("murali");
	    m.add("elaveni");
	    m.add("swetha");
	     
	    ArrayList s=new ArrayList();
	    s.add("sekar");
	    s.add("kalai");
	    s.add("appu");
	    s.add("manoj");
	    s.add("kavi"); 
	    
	    m.addAll(s);//addded the collectin m to s
	     
	    Iterator itr=m.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    	
	    }
	    
	    m.removeAll(s);//remove the value m from s
	    
	    System.out.println("Removing");
	    Iterator itr1=m.iterator();
	    while(itr1.hasNext()) {
	    	System.out.println(itr1.next());
	    }
	    
	    
	    

	}

}

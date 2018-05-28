import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		
	ArrayList a=new ArrayList()	;//the object created for arraylist
	
	a.add(15);//insert the element using boolean 
	a.add(25);
	a.add(12);
	a.add(15);//it allows duplicate values
	a.add(25);
	
	System.out.println(a.indexOf(12));//return the index for the value
	System.out.println(a.contains(1));//check the value is or not 
	System.out.println(a.get(3));//return the value from the index
	
	Iterator itr=a.iterator();//iterate the value 
	
	while(itr.hasNext()) {//it check the next value is found or not
		System.out.println(itr.next());//next() - it takes the next values
		
	}
	
	

	}

}

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2 {

	public static void main(String[] args) {

	 Library novels=new Library(1,"novels","shakespeare",50);
	 Library horror=new Library(2,"Horror","anabella",65);
	 Library java=new Library(3,"java","mike",120);
	 
	 LinkedHashSet<Library> m= new LinkedHashSet();
     m.add(novels);
     m.add(horror);
     m.add(java);
     
     
 for(Library s:m)
 {
	 System.out.println(s.id+" "+s.Author+" "+s.Bookname+" "+s.price);
 }
		
		
	}
}

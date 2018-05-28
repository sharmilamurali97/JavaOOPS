import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		
		LinkedList m=new LinkedList();
		
		m.add(11);
		m.add(11);
		m.add(22);
		m.add(33);
		m.add(44);
		
		m.addFirst(15);//insert the first element at the begining of the list
		m.addLast(25);//insert the last element at the end of the list
		Iterator itr=m.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(" SIZE : "+m.size());//return the number of elements in the list
		System.out.println("contains:"+m.contains(0));//check the value is contain or not
        System.out.println("get:"+m.get(4));//return the value for index
        System.out.println("indexof:"+m.indexOf(33));//return the index of the given element
        System.out.println("removeof:"+ m.remove());//it remove the first element of the list
        System.out.println("getfirst():"+m.getFirst());//it return the first element of the list
        System.out.println("getlast():"+m.getLast());//it return the last element of the list
        
        Iterator itr1=m.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		}
        }

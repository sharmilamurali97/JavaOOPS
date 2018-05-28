import java.util.ArrayList;

public class ArrayList3 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList();//generic type(explicitly give the datatype)
		
		a.add(15);
		a.add(25);
		a.add(12);
		a.add(34);
		a.add(16);
	
		
		for(int obj: a) {//using another method is "for each" loop to iterate the value 
			System.out.println(obj);
		}
	}

}

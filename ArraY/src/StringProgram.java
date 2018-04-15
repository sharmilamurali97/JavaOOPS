
public class StringProgram {
	

	public static void main(String[] args) {
		String college="Jeppiar srr enginering college";//literal-it stores the value in static constant pool
		System.out.println(college);//-it first check the value is  stored in constant pool after it create only reference 
		
		String s=new String("sharmila");//using new keyword-it will create new object each and every time in heap memory so it takes
		
	//	s = "sharmila";
		System.out.println(s);//more memory so it is inefficient

	}

}

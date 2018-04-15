
public class StringComparisonEqualTo {

	public static void main(String[] args) {
	String s="pen";
	String s1="pen";
	System.out.println(s==s1);//it will compare the reference not the values 
String s2=new String("pen");
System.out.println(s==s2);//it stores in heap memory so it cannot take the reference
	}//from the static constant pool so it shows false value

}

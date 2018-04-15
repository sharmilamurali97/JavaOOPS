
public class StringComparisonEquals { 
	public static void main(String[] args) { 
		String s="Sharmila";//literal
		String s1="Sharmila";
		System.out.println(s.equals(s1));//boolean
		String s2="sharmila";
		System.out.println(s.equals(s2));
System.out.println(s.equalsIgnoreCase(s2));//equal ignorence
String s3=new String("Sharmila");//newkeyword
System.out.println(s.equals(s3));
String s4="sharmila";
System.out.println(s.equalsIgnoreCase(s4));


	}

}

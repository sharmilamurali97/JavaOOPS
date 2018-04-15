
public class StringComparisonCompareTo {

	public static void main(String[] args) {
		String s="Sharmila";
		String s1="subashree";
		System.out.println(s.compareTo(s1));
		
		String s2="Sharmila";//compare the string objects lexographically(ascii values) and returns 0 or 
		System.out.println(s.compareTo(s2));//positive or negative values

	}

}

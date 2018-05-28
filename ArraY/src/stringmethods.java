
public class stringmethods {

	public static void main(String[] args) {
		String s= "subashree";
		System.out.println(s.toUpperCase());//capital letters
		System.out.println(s.toLowerCase());//small letters
		System.out.println(s.length());//the length of the string name
		System.out.println(s.charAt(5));//the letter of the string value
		System.out.println(s.startsWith("a"));//check the whether tis letter startswith or not
		System.out.println(s.endsWith("e"));//check whether tis letter endswith or not
		System.out.println(s.trim());//remove the whitespace
		System.out.println(s.valueOf(s));//returns the string value
	    System.out.println(s.valueOf(s+10));	//return the string value with concat
	    System.out.println(s.replace("suba","yuva"));//replace the given string value
		

	}

}

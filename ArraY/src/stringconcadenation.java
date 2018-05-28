
public class stringconcadenation {

	public static void main(String[] args) {
	String s="sharmila";
	String s1="murali";
	System.out.println(s+s1);//using + operator it can add integer and string values 
    System.out.println(s.concat(s1));// using concat it can add only string values
    int s3=15;
    int s4=25;
    String name="elaveni";
    System.out.println(s3+s4+name+s4+s3);//when using string name afterit consider
                                         //string values not as integer values but it  
  //  System.out.println(s3.concat(s4));//can take before as integer values
	}

}

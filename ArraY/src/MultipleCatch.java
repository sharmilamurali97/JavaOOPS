
public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("checking arithmetic exception");
		try {
			int i[]=new int[3];//it first shows the arithmetic becoz its have a first 
			i[4]=50/0;//priority instead of all other exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		
		}catch(ArithmeticException a) {
			System.out.println(a);
		}catch(Exception e) {//at the same time it have a last priority instead of 
			System.out.println(e);//all other exception
		}

		System.out.println("by sharmila");

	}

}

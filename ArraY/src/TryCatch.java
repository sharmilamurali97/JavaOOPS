
public class TryCatch {

	public static void main(String[] args) {
		System.out.println("checking arithmetic exception");
		try {
		int i=50/0;
		}catch(ArithmeticException a) {
			System.out.println(a);
		}

		System.out.println("by sharmila");

	}

}

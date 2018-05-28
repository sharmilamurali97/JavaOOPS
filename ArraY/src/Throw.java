
public class Throw {
	
	private static void validation(int i) {

		if(i<20) {//,more than given value
			throw new ArithmeticException("not valid");//exception occur here
			}else {
				System.out.println("valid");
			}
		}

	public static void main(String[] args) {
	validation(15);//the given value
	
	}



}

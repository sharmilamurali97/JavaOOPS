
public class CheckFinally {

	public static void main(String[] args) {
		System.out.println("Check Finally");
	try {
		int i = 50;
	}catch(Exception e) {
		System.out.println(e);
	}finally{
		System.out.println("I will execute");//whatever exception occur it execute
	}//many catches have only one final
//final will not execute in two classes ie. 1. sysyem.exit()and another 2. error

	}

}

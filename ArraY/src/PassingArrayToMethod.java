
public class PassingArrayToMethod {
static	int i=0;
	
	static void calling(int a[]) {
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

	public static void main(String[] args) {
		int a[]= {12,15,17,25,29};
		calling(a);
		
		
		
	}

}

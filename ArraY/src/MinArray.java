
public class MinArray {
	
	static int i=0;
	static void calling(int a[])//main fuction passes the array value
	{
		for(i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);		
			}		
	}
static void findingMinimum(int a[]) {
		int min=a[i];
		for(i=0;i<a.length-1;i++) {
			if(a[i] > a[i+1]){
					min= a[i];
				}
		}
		System.out.println("Minimum value "+min);
	}	
	public static void main(String[] args) {
		int a[]= {12,26,28,76,98};
		calling(a);
		findingMinimum(a);
		

	}

}

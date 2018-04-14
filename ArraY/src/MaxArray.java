
public class MaxArray {
	static int i=0;
	static void calling(int a[]) {
		for(i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		}
	static void findingmaximum(int a[]) {
		int max=a[i];
		for(i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				max=a[i+1];
			}
		}
		System.out.println("maximumvalue "+max);
	}

	public static void main(String[] args) {
		int a[]= {14,15,10,19,22};
		calling(a);
findingmaximum(a); 		
		
		

	}

}

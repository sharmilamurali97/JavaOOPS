
public class AscendingSorting {
	static int i=0,j;
	static int rev=0;
	static int temp =0;
	static void findingascending(int a[]) {
		for(i=0;i<a.length-1;i++) {
			for(j=1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				temp = a[i];
				a[i]= a[j];
				a[j]=temp;
			
		}
			
			}
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {
		int a[]= {30,10,70,20,50};
		findingascending(a);
		

	}

}

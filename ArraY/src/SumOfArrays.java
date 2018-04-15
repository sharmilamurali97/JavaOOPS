
public class SumOfArrays { 
    static int sum=0;
 static   int avg;
	
	static void display(int a[]) {
	for(int i=0;i<a.length;i++) {
		sum = sum+a[i];
		avg=sum/5;
		}
	System.out.println(sum);//sum of numbers
	System.out.println(avg);//avg of numbers
}

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		display(a);
		
		
		
	}

}

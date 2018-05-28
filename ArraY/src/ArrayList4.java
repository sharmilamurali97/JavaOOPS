import java.util.ArrayList;

public class ArrayList4 {
	public static void main(String[] args) {
		
Student sharmi=new Student(91,"sharmi",20);

Student subashree=new Student(111,"suba",22);

Student pavi =new Student(76,"pavi",20);
	
 
	ArrayList <Student> a = new ArrayList();
	a.add(sharmi);
	a.add(subashree);
	a.add(pavi);

	for(Student s:a){
		System.out.println(s.roll_no +" "+s.name+" "+s.age);
		
	}
}
}

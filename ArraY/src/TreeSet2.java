import java.util.TreeSet;

class Student1 implements Comparable<Student1>{
int id;
String name;
int marks;
int age;
Student1(int id,String name,int marks,int age) {
	this.id=id;
	this.name=name;
	this.marks=marks;
	this.age=age;
}
public int compareTo(Student1 o) {
		if(marks>o.marks)
		return 1;
		else if(marks<o.marks) {
			return -1;
		}
		else {
			return 0;
			
		}
		
	}
	
}
public class TreeSet2 {

public static void main (String arg[]) {
	
	Student1 sharmi=new Student1(01,"sharmi",463,20);
	Student1 pavi=new Student1(02,"pavi",482,20);
	Student1 saranya=new Student1(03,"saranya",446,20);
	Student1 nikitha=new Student1(04,"nikitha",473,20);
	
TreeSet<Student1>m=new TreeSet();
m.add(sharmi);
m.add(pavi);
m.add(saranya);
m.add(nikitha);

for(Student1 s:m) {
	System.out.println(s.id+" "+s.name+" "+s.marks+" "+s.age);
}
}
	
		

	

}

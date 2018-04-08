interface house
{
	void cement();
	void soil();
}
interface school{
	void cement();
	void soil();
}
class Interface3 implements house,school { // Achieved Multiple inheritance via interface
 public void cement(){
	System.out.println("CEMENT");
}
public void soil() {
	System.out.println("SOIL");
	
}
	public static void main(String[] args) {
		Interface3 built =new Interface3();
		built.cement();
		built.soil();
		
	}

}

interface pen
{
	void writing();
}
interface pencil extends pen  //interface extends interface
{
	void drawing();
}
 class Interface4 implements pencil { // it implements extended interface
	 public void drawing() {
		 System.out.println("DRAWING");
	 }
	 public void writing() {
		 System.out.println("WRITING");
			 
		 }
	 public static void main(String[] args) {
		 Interface4 sharmi =new Interface4();
		 sharmi.drawing();
		 sharmi.writing();
		 

	}

}

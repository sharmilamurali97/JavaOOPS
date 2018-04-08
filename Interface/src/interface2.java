interface plants
{
	void shadow();
	void air();
}
interface sea
{
	void skyblue();
	void fish();
}
 class Interface2 implements plants,sea {
	 public void shadow() {
		 System.out.println("SHADOW");
	 }
	 public void air() {
		 System.out.println("AIR");
	 }
	
		 public void skyblue() {
			 System.out.println("SKYBLUE");
		 }
		 public void fish() {
			 System.out.println("FISH");
				 
			 }
		 public static void main(String[] args) {
			 Interface2 nature =new Interface2();
			 nature.shadow();
			 nature.air();
			 nature.skyblue();
			 nature.fish();
		}
}

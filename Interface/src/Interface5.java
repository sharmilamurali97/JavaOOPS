interface car
{
	void run();
}
interface bike 
{
	void run();
}
interface lorry extends bike,car{// achieve multiple inheritance
	void  run();
	
}


 class Interface5 implements lorry {
	 public void run() {
		 System.out.println("RUNNING");
	 }

	public static void main(String[] args) {
		Interface5 transports =new Interface5();
		transports.run();

	}

}

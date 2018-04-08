 
	interface animal
	{
		void eating();
		void sleeping();	
	}
	 class Interface1 implements animal{ //interface implemtented by classs
		
	
		@Override
		public void eating() {
			System.out.println("EATING");
			
		}
		@Override
		public void sleeping() {
			System.out.println("SLEEPING");
			
		}
	public static void main(String[] args) {
		Interface1 deer = new Interface1();
		deer.eating();
		deer.sleeping();
			
		}

	}
	
	

	


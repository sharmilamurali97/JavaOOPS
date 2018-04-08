
abstract class Bank {
			abstract void rateofinterest();
		}
			class SBI1 extends Bank
			{
		void  rateofinterest()
			{
				System.out.println(6);
			}
			}
			class HDFC extends Bank	
			{
				void rateofinterest()
				{
					System.out.println(8);
				}
			}
			class Test{
				public static void main(String[] args) {
				HDFC user = new HDFC();
				user.rateofinterest();
				
				
			}
			

		


	}






package Day43.pack;

import org.testng.annotations.*;


public class C3 {
	


	@Test
	void monu()
	{
		System.out.println("This is monu form C2");
	}
	
	@AfterSuite
	void as() 
	{
		System.out.println("This is AfterSuit");
	}
	
	@BeforeSuite
	void bt() 
	{
		System.out.println("This is BeforeSuit");
	}
	
}
